//与类文件类似，接口文件中只能有一个public接口，并且接口名等于文件名
//
public interface USB{
  //组成
  double version = 4.0;//默认的修饰：public static final
  void read();    //默认的修饰：publc abstract
  void write();
  
}