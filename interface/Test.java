public class Test{
  public static void main(String[] args){
  Mobile T2 = new Mobile(1234,"����2.0");
  int version = 4;
  T2.info();
  
  T2.call();
  T2.sms();
  
  T2.open();
  T2.close();
  
  System.out.println("Wifi��"+T2.ssid +"���룺"+T2.pass);
  
  T2.read();
  T2.write();
  
  System.out.println("USB��׼��"+T2.version);
  System.out.println("USB��"+USB.version);
  }
}