public class Cow{
  private double weight;
    private static int q = 5  ;
  public Cow(){}
  public Cow(double weight){
    this.weight = weight;
  }
  //����һ���Ǿ�̬�ڲ���
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
	  System.out.println("��ǰţ����ɫ�ǣ�"+color+"��:"+length );
	  System.out.println("��ǰţ�����ڱ���ţ�����أ�"+weight );
	}
  }
  
  //����һ����̬�ڲ���
  static class CowStatic{
    private static int age = 7;
	public void accessOuterProp(){
	  System.out.println(q);
	}
  }
  
  
  
  public void test(){
	CowLeg cl = new CowLeg(1.12,"�ڰ����");
	CowStatic c2 = new CowStatic();
	cl.info();
	c2.accessOuterProp();
	System.out.println(c2.age);
  }
  public static void main(String[] args){
   //����һ���ֲ��ڲ���
   class InnerBase{
     int h;
   }
   class InnerSub extends InnerBase{
     int i;
   }
   InnerSub is = new InnerSub();
    is.h = 10;
	is.i = 11;
	System.out.println("InnerSub�����h��i Field�ǣ�"
	+is.h+","+is.i);

	Cow cow = new Cow(378.9);
	cow.test();
	
  }
}