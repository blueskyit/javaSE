import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class GetPostTest {

	public static String sendGet(String url,String param){
		String result = "";
		String urlName = url + "?" +param;
		try {
			URL realUrl = new URL(urlName);
			URLConnection conn = realUrl.openConnection();
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
					"Mozilla/4.0(compatible;MSIE 6.0;Windows NT 5.1;SV1)");
			conn.connect();
			Map<String , List<String>> map = conn.getHeaderFields();
			for (String key : map.keySet()) {
				System.out.println(key +"--->"+map.get(key));
			}
			try( 
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"))){
				    String line;
				    while ((line = in.readLine()) !=null){
				    	result+="\n" +line;
				    }
			    }
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
