/*
 *���̣��ǲ���ϵͳ��Ӧ�ó�����䣬���̵��ȵ���С��λ�����������еĳ���
 *�̣߳���ϵͳ��ִ���������С��λ���������ִ�е���С��λ�����̵Ķ��ִ������
 *      �߳����Լ������е�����
 *      ���� ִ�С�ͬʱ
 *������
 *����̣�
 *���̣߳�
 *  ����ϵͳ�����̣��̷߳���ǳ�С��ʱ��Ƭ����osȥ���ȡ�����л�===����Ͽ���ͬʱִ��
 *  JVM�Ķ��̣߳�
 *       1��main�̣߳�
 *       2�����������̣߳�
 *  
 *  
 *  
  */
class A{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�ֶ���������");
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
       System.out.println("main����");
        
	}

}
