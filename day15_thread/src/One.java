
public class One extends Thread {
     static int ticket = 10;
    static int num = 0;
    
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10.; i++) {
			if(ticket > 0){
				ticket --;
				num ++;
				System.out.println(getName()+"迈出了第"+num+"张车票，还剩"+ticket+"张车票");
				
			}
		}
	}


	public static void main(String[] args) {
		One o1 = new One();
		One o2 = new One();
		One o3 = new One();
		o1.setName("第一个售票窗口");
		o2.setName("第二个售票窗口");
		o3.setName("第三个售票窗口");
		o1.start();
		o2.start();
		o3.start();
		
	}

}
