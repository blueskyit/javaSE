//�����ಿ��
interface Product{
  public double getPrice();
  public String getName();
}
public class AnonymousTest{
  public void test(Product p){
    System.out.println("��һ��" + p.getName() + 
	"������"+ p.getPrice()+ "Ԫ");
  }
  public static void main(String[] args){
    AnonymousTest ta = new AnonymousTest();
	//�˴�����������ʵ�����ʵ��
	ta.test( new Product(){
	  public double getPrice(){
	    return 567.8;
	  }
	  public String getName(){
	    return "AGP �Կ�";
	  }
	});
  }
}