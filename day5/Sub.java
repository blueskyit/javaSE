public class Sub extends Base{
  String str;//子类特有的属性
  int c = 999;
  void sub_show(){
  System.out.println("sub类特有的方法");
  }
  void show(){
     System.out.println("子类复写了父类的方法sub class");
	 
  }
  public static void main(String[] args){
  //向上转型（默认）
  //不能访问子类新增的属性【】可以访问基类特有属性，被子类覆盖的方法
  Base base = new Sub();
  System.out.println(base.a+""+base.b+"  ");
   // System.out.println(base.c );不能访问子类独有的属性
  base.base_show();
  base.show();
  //向下转型（需要强制转化）
  Base ba =new Sub();
  Sub sub = (Sub)ba;
  sub.show();
  sub.base_show();
  System.out.println(sub.a);
 System.out.println(sub.b+"  "+sub.c);
  }
  
}