
public class FirstThread extends Thread {
    public void run(){
    	for (int i = 0; i < 5; i++) {
			System.out.println(getName() +"  "+ i);
		}
    	
    }
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			if(i==10){
				FirstThread b1 = new FirstThread();
				FirstThread b2 = new FirstThread();
				b1.setName("ÃÀºïÍõ");
				b1.start();
				b2.start();
			}
		}

	}

}
