package node_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNode {

	
	public static void main(String[] args) {
		//ʹ���ڴ����ַ�������Ϊ����Դ
		String src = "aaaaaaaaaaaaaaaaa"+
		             "bbbbbbbbbbbbbbbbb"+
                     "ccccccccccccccccc"+
		             "ddddddddddddddddd";
		char[] buffer = new char[32];
		int hasRead = 0;
		StringReader sr = new StringReader(src);
	    try {
			while ((hasRead=sr.read(buffer))>0){
				System.out.println(new String(buffer,0,hasRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	    StringWriter sw = new StringWriter();
	    sw.write("eeeeeeeeeeeeeeeeee\r");
	    sw.write("ffffffffffffffffff\r");
	    sw.write("gggggggggggggggggg\r");
	    sw.write("zzzzzzzzzzzzzzzzzz\n");
	    System.out.println(sw.toString());
	}

}
