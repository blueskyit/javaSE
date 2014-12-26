package ipc2;

/* 	ʹ��ͬ��������
 *					����
 *	�������ݡ���������������>��������������������������>��.����������������
 *			�߳�ͬ�������ݰ�ȫ 	�̼߳�ͨ�ţ�Э��	
 */

class Resource {
	private int id;
	private String name;
	private boolean flag = false; // ��Ʒ��

	//����һ��:ͬ����������--this��������
	public synchronized void set(int id, String name) {
		// 1����Ʒ��
		if (this.flag) {// ͣ������Ϣ���߳��ͷ�cpu
			try {
				this.wait(); //
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 2������
		this.id = id;
		this.name = name;
		System.out.println("������һ����" + this.name);
		// 3��֪ͨ����
		this.flag = true;
		this.notify();
	}
	
	//����һ��
	public synchronized void sales() {
		// 1����Ʒ��
		if (!this.flag) { // û��Ʒ:
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 2������
		System.out.println("����name��" + this.name + "\t id:" + this.id);
		// 3������
		this.flag = false;
		this.notify(); // ֪ͨ
	}
}

/*
 * ���ߣ���Ʒ�Ƿ�����ȥ�ˣ� ��ȥȷʵ�Ƿ񿪹����������� �У� 1��֪ͨ���� 2�������� �ޣ� 1������֪ 2������
 */
class Input implements Runnable {
	Resource r;

	// alt+shift +s
	public Input(Resource r) {
		super();
		this.r = r;
	}

	int key = 0;
	@Override
	public void run() {
		while (true) {
			switch (key++ % 3) {
			case 0:
				r.set(6666, "iphone6");
				break;
			case 1:
				r.set(7777, "iphone7");
				break;
			case 2:
				r.set(8888, "iphone8");
				break;
			default:
				break;
			}
		}
	}
}

/*
 * ���ۣ��Ƿ��в�Ʒ������ �У�1�������߸�֪ 2������ �ޣ�1��֪ͨ���� 2����Ϣ��ֹͣ����
 */
class Output implements Runnable {
	Resource r;

	public Output(Resource r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) { //
			r.sales();
		}
	}
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1������������Դ
		Resource r = new Resource();

		// 2�������߳�����run
		Input input = new Input(r);
		Output output = new Output(r);

		// 3�������̶߳���
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);

		// 4������
		th_in.start();
		th_out.start();
	}
}
