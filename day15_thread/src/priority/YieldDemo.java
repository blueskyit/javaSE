package priority;

public class YieldDemo extends Thread{
    
	 public YieldDemo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
	for (int i = 0; i < 100; i++) {
		System.out.println(getName()+"=="+i);
		if(i==25){
			//this.yield();
			Thread.yield();
			System.out.println(getName() + "++++++++++++"+i);
		}
	}
	}

	
	public static void main(String[] args) {
		YieldDemo yd1 = new YieldDemo("xiancheng1");
		YieldDemo yd2 = new YieldDemo("xiancheng2");
		//yd1.setPriority(MAX_PRIORITY);
		yd1.start();
		yd2.start();
		
	}

}
