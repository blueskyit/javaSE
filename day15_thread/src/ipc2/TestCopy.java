package ipc2;

class Resourse{
     private int id;
     private String name ;
     private boolean flag = false;
     public synchronized void set(String name,int id){
    	 if(this.flag){
    		try{
    			this.wait();
    		} catch (InterruptedException e) {
				e.printStackTrace();
    	    }
    		}
    	 this.name = name;
    	 this.id = id;
    	 System.out.println("生产了一部"+this.name);
    	 flag = true;
    	 this.notify();
    	 
     } 
    	 public synchronized void sales() {
    			
    			if (!this.flag) { 
    				try {
    					this.wait();
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
    			}
    		
    			System.out.println("卖：name：" + this.name + "\t id:" + this.id);
    		
    			this.flag = false;
    			this.notify(); // 通知
    		}
    	  
     }
    	
class Input1 implements Runnable {
	Resourse r;
	public Input1(Resourse b) {
		super();
		r = b;
	}

	@Override
	public void run() {
		while (true){
			int k = 0;
			switch (k++%3) {
			case 0:
				r.set("ipnone6", 6666);
				break;
			case 1:
				r.set("ipnone7", 7777);
				break;
			case 2:
				r.set("ipnone8",8888);
				break;	

			default:
				break;
			}
		}
		
	}
	
}
class Output1 implements Runnable{
	Resourse r;
	public Output1(Resourse b) {
		super();
		r = b;
	}
	@Override
	public void run() {
		while (true){
			r.sales();
			
		}
		
	}
	
}

public class TestCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resourse b = new Resourse();
		Input1 input = new Input1(b);
		Output1 output = new Output1(b);
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);
		th_in.start();
		th_out.start();
		

	}

}
