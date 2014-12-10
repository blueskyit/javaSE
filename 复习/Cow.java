public class Cow{
  private double weight;
    private static int q = 5  ;
  public Cow(){}
  public Cow(double weight){
    this.weight = weight;
  }
  //定义一个非静态内部类
  private class CowLeg{
    private double length;
	private String color;
	
	public CowLeg(){}
	public CowLeg(double length,String color){
	  this.length = length;
	  this.color = color;
	}
	public void setLength(double length){
	  this.length = length;
	}
	public double getLength(){
	  return this.length;
	}
	public void setColor(String color){
	  this.color = color;
	}
	public String getColor(){
	  return this.color;
	}
	public void info(){
	  System.out.println("当前牛腿颜色是："+color+"高:"+length );
	  System.out.println("当前牛腿所在本体牛的体重："+weight );
	}
  }
  
  //定义一个静态内部类
  static class CowStatic{
    private static int age = 7;
	public void accessOuterProp(){
	  System.out.println(q);
	}
  }
  
  
  
  public void test(){
	CowLeg cl = new CowLeg(1.12,"黑白相间");
	CowStatic c2 = new CowStatic();
	cl.info();
	c2.accessOuterProp();
	System.out.println(c2.age);
  }
  public static void main(String[] args){
   //定义一个局部内部类
   class InnerBase{
     int h;
   }
   class InnerSub extends InnerBase{
     int i;
   }
   InnerSub is = new InnerSub();
    is.h = 10;
	is.i = 11;
	System.out.println("InnerSub对象的h和i Field是："
	+is.h+","+is.i);

	Cow cow = new Cow(378.9);
	cow.test();
	
  }
}