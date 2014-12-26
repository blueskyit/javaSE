package ipc;
/*
 * 
 * 
 * 
 */
class Resource{
	int id;
	String name;
	boolean flag = false;
	
}
//产线
class Input implements Runnable{
    Resource r;
	public Input(Resource r){
		super();
		this.r = r;
	}
	Object obj1 = new Object();
	int key = 0;
	
	@Override
	public void run() {
		
	   
	    
		while(true){
		synchronized (r) {
			if(r.flag){
	    	try {
				r.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
		switch(key++%3){
		case 0: r.id = 6666;  r.name = "iphone6";System.out.println("生产iPhone6");
		         break;
		case 1: r.id = 7777;  r.name = "iphone7";System.out.println("生产iPhone7");
        break;
		case 2: r.id = 8888;  r.name = "iphone8";System.out.println("生产iPhone8");
        break;
        default: break;	
	    }
		r.flag = true;
		r.notify();
		}
		
	
	  }
	}	
}

//销售
class Output implements Runnable{
	Resource r;
	 Object obj = new Object();
 	public Output(Resource r){
		super();
		this.r = r;
	}
	@Override
   public void run() {
		
	  while(true){
		  synchronized (r) {
			  if(!r.flag){
			try {
				r.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		  System.out.println("卖：name:"+r.name+"\t id:"+r.id);
	  r.flag = false;
	  r.notify();
    }
		  } 
		 
	  
  }
	
}


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource r = new Resource();
		
		Input input = new Input(r);
		Output output = new Output(r);
		
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);
		
		th_in.start();
		th_out.start();
	}

}
