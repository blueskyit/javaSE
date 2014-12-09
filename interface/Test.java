public class Test{
  public static void main(String[] args){
  Mobile T2 = new Mobile(1234,"´¸×Ó2.0");
  int version = 4;
  T2.info();
  
  T2.call();
  T2.sms();
  
  T2.open();
  T2.close();
  
  System.out.println("Wifi£º"+T2.ssid +"ÃÜÂë£º"+T2.pass);
  
  T2.read();
  T2.write();
  
  System.out.println("USB±ê×¼£º"+T2.version);
  System.out.println("USB£º"+USB.version);
  }
}