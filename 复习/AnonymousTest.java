//匿名类部类
interface Product{
  public double getPrice();
  public String getName();
}
public class AnonymousTest{
  public void test(Product p){
    System.out.println("买一个" + p.getName() + 
	"花掉了"+ p.getPrice()+ "元");
  }
  public static void main(String[] args){
    AnonymousTest ta = new AnonymousTest();
	//此处传入其匿名实现类的实例
	ta.test( new Product(){
	  public double getPrice(){
	    return 567.8;
	  }
	  public String getName(){
	    return "AGP 显卡";
	  }
	});
  }
}