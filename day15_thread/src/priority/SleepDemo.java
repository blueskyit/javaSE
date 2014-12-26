package priority;

public class SleepDemo extends Thread {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("xiumian 5s start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println(getName());
		System.out.println("xiumian 5s end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("main start");
        SleepDemo sd = new SleepDemo();
        sd.start();
        System.out.println(Thread.currentThread().getName());
      
        System.out.println("main end");
	}

}
