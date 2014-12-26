
public class RunnableDemo  implements Runnable {
    private int i;
    
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+ "  "+i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo rd = new RunnableDemo();
		RunnableDemo rd1 = new RunnableDemo();
		Thread th = new Thread(rd);
		Thread th1 = new Thread(rd1);
		
		th.start();
		th1.start();  
 
	}

}
