/*
 *进程：是操作系统对应用程序分配，进程调度的最小单位，【正在运行的程序】
 *线程：是系统中执行任务的最小单位【负责程序执行的最小单位，进程的多个执行流】
 *      线程有自己的特有的任务
 *      并行 执行、同时
 *多任务：
 *多进程：
 *多线程：
 *  操作系统给进程，线程分配非常小的时间片、由os去调度、随机切换===宏观上看似同时执行
 *  JVM的多线程：
 *       1、main线程：
 *       2、垃圾回收线程：
 *  
 *  
 *  
  */
class A{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("手动回收垃圾");
		System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
		
		super.finalize();
	}
}
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
        A a = new A();
        new A();
        new A();
        new A();
        new A();
        System.gc();
        new A();
       System.out.println("main函数");
        
	}

}
