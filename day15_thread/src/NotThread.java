

 class Monkey1 extends Thread {
    String name;
    public Monkey1(String name){
    	super();
    	this.name = name ;
    	
    }
	public void fight(){
		for (int i = 1; i < 11; i++) {
			System.out.println(name + "��ܵ�" + i + "����콫");
		}
	}
	public void run(){
		fight();
		System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
	}
}
	public class NotThread{
		public static void main(String[] args) {
		Monkey1 m1 = new Monkey1("��һ�������");
		Monkey1 m2 = new Monkey1("�ڶ��������");
		Monkey1 m3 = new Monkey1("�����������");
		m1.setName("�߳�һ");
		m1.start();
		m2.start();
		m3.start();
		
		System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
	}
}
	