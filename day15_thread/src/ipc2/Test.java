package ipc2;

/* 	使用同步方法：
 *					任意
 *	共享数据————————>锁————————————>锁.方法——————
 *			线程同步：数据安全 	线程间通信：协作	
 */

class Resource {
	private int id;
	private String name;
	private boolean flag = false; // 产品？

	//生产一部:同步方法：锁--this————
	public synchronized void set(int id, String name) {
		// 1、产品？
		if (this.flag) {// 停产、休息：线程释放cpu
			try {
				this.wait(); //
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 2、生产
		this.id = id;
		this.name = name;
		System.out.println("生产了一部：" + this.name);
		// 3、通知销售
		this.flag = true;
		this.notify();
	}
	
	//销售一部
	public synchronized void sales() {
		// 1、产品？
		if (!this.flag) { // 没产品:
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 2、销售
		System.out.println("卖：name：" + this.name + "\t id:" + this.id);
		// 3、完了
		this.flag = false;
		this.notify(); // 通知
	}
}

/*
 * 产线：产品是否卖出去了？ 再去确实是否开公继续生产？ 有： 1、通知销售 2、不生产 无： 1、被告知 2、生产
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
 * 销售：是否有产品可卖？ 有：1、被产线告知 2、销售 无：1、通知产线 2、休息：停止销售
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
		// 1、创建共享资源
		Resource r = new Resource();

		// 2、创建线程任务：run
		Input input = new Input(r);
		Output output = new Output(r);

		// 3、创建线程对象：
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);

		// 4、开启
		th_in.start();
		th_out.start();
	}
}
