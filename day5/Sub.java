public class Sub extends Base{
  String str;//�������е�����
  int c = 999;
  void sub_show(){
  System.out.println("sub�����еķ���");
  }
  void show(){
     System.out.println("���ิд�˸���ķ���sub class");
	 
  }
  public static void main(String[] args){
  //����ת�ͣ�Ĭ�ϣ�
  //���ܷ����������������ԡ������Է��ʻ����������ԣ������า�ǵķ���
  Base base = new Sub();
  System.out.println(base.a+""+base.b+"  ");
   // System.out.println(base.c );���ܷ���������е�����
  base.base_show();
  base.show();
  //����ת�ͣ���Ҫǿ��ת����
  Base ba =new Sub();
  Sub sub = (Sub)ba;
  sub.show();
  sub.base_show();
  System.out.println(sub.a);
 System.out.println(sub.b+"  "+sub.c);
  }
  
}