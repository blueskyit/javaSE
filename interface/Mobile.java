//ʵ�ֽӿ�
public class Mobile implements USB,Wifi{
  private int num;
  private String  brand;
  public Mobile(){}
  public Mobile(int num, String brand){
    this.num = num;
	this.brand = brand;
  }
  //
  public void info(){
    System.out.println("Ʒ�ƣ�"+brand);
	System.out.println("���룺"+num);
  }
  public void call(){
    System.out.println("��绰");
  }
  public void sms(){
    System.out.println("������");

  }
  public void read(){
     System.out.println("read USB");
  }
  public void write(){
     System.out.println("write USB");
  }
  public void open(){
     System.out.println("open Wifi");
  }
   public void close(){
     System.out.println("close Wifi");
  }
}