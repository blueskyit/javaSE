package priority;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Demo extends Thread{
	String name;

	public Demo(String name) {
		super();
		this.name = name;
		this.setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(getName()+"  pri:"+getPriority());
	}
	
}

public class PriorityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo demo1 = new Demo("线程1");
		Demo demo2 = new Demo("线程2");
		Demo demo3 = new Demo("线程3");
		demo1.setPriority(Demo.MAX_PRIORITY);
		demo3.setPriority(Demo.MAX_PRIORITY);
		demo2.setPriority(3);
		demo1.start();
		demo2.start();
		demo3.start();

	}

}
