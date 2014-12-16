//自定义异常类：必须继承execption异常，可抛性=抛给调用它的调用者，==throw throws关键字抛出
// 实现了：判断逻辑处理   和  异常处理的  分离

//负下标异常
class FuExecption extends RuntimeException{
	public FuExecption() {	
	}

	public FuExecption(String message) {
		super(message);	//
	}
}


//演示一下抛出异常的流程
class Test{
	//throws FuExecption：
	void run(int[] arr, int index) //throws FuExecption
	{
		//自动抛异常：JVM--new----throw---->main---->JVM---->控制台
		//System.out.println(arr[index]);	//throw   new ArrayIndexOutOfBoundsException(index);
		
		//手动抛出异常
		if(arr == null){
			//异常对象：new + 构造
			//throw new NullPointerException();
			throw new NullPointerException("空指针异常");
		} 

		if(index < 0){
			//throw new ArrayIndexOutOfBoundsException("下标负");	//手动抛出异常 +  JVM处理
			//手动抛出：自定义异常				
			throw new FuExecption("自定义--负下标异常");		//抛出—— jvm处理【runtime】
			
		}else if(index >= arr.length){
			//throw new ArrayIndexOutOfBoundsException();
			throw new ArrayIndexOutOfBoundsException("index=" + index + ">=数组长度" + arr.length);
		}else {
			System.out.println(arr[index]);
		}		
	}
}

public class ExecptionDemo {

	/**
	 * @param args：
	 * @throws FuExecption 
	 */
	public static void main(String[] args) //throws FuExecption
	{	//---》JVM
		
		int[] arr = new int[5];
		int[] array = null;
		
		//一、在main函 数中，直接非法操作数组
//		arr[5] = 1232;			//ArrayIndexOutOfBoundsException:
//		array[0] = 123;			//NullPointerException	
		
		//二、调用成员方法，在成员方法中非法操作数数组
		//run(arr, 6);	
		
		//三、其他类的 成员方法中非法操作
		Test test = new Test();
		//test.run(array, 1);		//NullPointerException				
		
		test.run(arr, -2);	//常识性	//自动抛异常：JVM--new----throw---->JVM---->控制台
		
		//test.run(arr, 5);		//throw   new ArrayIndexOutOfBoundsException();
		
		
		System.out.println("========end===========");
	}
	
	public static void  run(int[] arr, int index) {
		System.out.println(arr[index]);
		System.out.println("========run   end===========");
	}
	
	
	
	
	

}
