public class IfTest{
  public static void main (String args[]){
  if(1<100){
  System .out.println("第一种格式");
  }
  boolean flag = true;
  if(flag){
  System .out.println("zhen");
  }
  else{
  System .out.println("jia");
  }
  int score = 56;
  if(score<60){
  System .out.println("bujige ");
  }
  else if(60 < score && score< 80 ){
  System .out.println("liang");
  }
  else{
   System .out.println("youxiu");
  }
  }
}