public class Triangle extends Shape{
  private double a;
  private double b;
  private double c;
   public Triangle(){}
  public Triangle(String color,double a,double b,double c){
    super(color);
    this.setSides(a,b,c);
  }
  public void setSides(double a,double b,double c){
    if(a>=b+c || b>=a+c || c>=a+b){
	  System.out.println("����������֮��Ӧ���ڵ�����");
	}
	this.a = a;
	this.b = b;
	this.c = c;
  }
  public double calPerimeter(){
   return a+b+c;
  }
  public String getType(){
   return getColor()+"sanjiaoxing"  ;
  }
  public static void main(String[] args){
    Shape f = new Triangle();
	f.setColor("��");
	System.out.println(f.getColor());
	Shape g = new Triangle("hong ",3,4,9);
	System.out.println(g.calPerimeter());
	
  }
  
}