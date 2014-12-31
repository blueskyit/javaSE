import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.print.DocFlavor.INPUT_STREAM;


public class DownUtil {
	private String path;
	private String targetFile;
	private int threadNum;
	private DownThread[] threads;
	private int fileSize;
	
	
	
	public DownUtil(String path, String targetFile, int threadNum) {
	
		this.path = path;
		this.threadNum = threadNum;
		threads = new DownThread[threadNum];
		this.targetFile = targetFile;
	}
	
	public void download ()throws Exception{
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setReadTimeout(5*1000);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept","image/gif,image/jpeg,image/pjpeg,"
				+"application/x-shockwave-flash,application/xaml+xml,"
				+"application/vnd.ms-xpsdocument,application/x-ms-xbap,"
				+"application/x-ms-application,application/vnd.ms-excel,"
				+"application/vnd.ms-powerpoint,application/msword,*/*");
		conn.setRequestProperty("Accept-Language", "zh-CN");
		conn.setRequestProperty("Charset", "UTF-8");
		conn.setRequestProperty("Connection", "keep-Alive");
		
		fileSize = conn.getContentLength();
		conn.disconnect();
		int currentPartSize = fileSize / threadNum+1;
		RandomAccessFile file = new RandomAccessFile(targetFile, "rw");
		
		file.setLength(fileSize);
		file.close();
		for(int i= 0;i<threadNum;i++){
			int startPos = i*currentPartSize;
			RandomAccessFile currentPart = new RandomAccessFile(targetFile, "rw");
			currentPart.seek(startPos);
			threads[i] = new DownThread(startPos,currentPartSize,currentPart);
			threads[i].start();
			
		}
		
		
	}
	public double getCompleteRate(){
		int sumSize = 0;
		for (int i = 0; i < threadNum; i++) {
			sumSize+=threads[i].length;
			
		}
		return sumSize*1.0/fileSize;
	}
private class DownThread extends Thread{
	private int startPos;
	private int currentPartSize;
	private RandomAccessFile currentPart;
	public int length;
	public DownThread(int startPos, int currentPartSize,
			RandomAccessFile currentPart) {
		this.startPos = startPos;
		this.currentPart = currentPart;
		
	}
	public void run (){
		URL url;
		try {
			url = new URL(path);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setReadTimeout(5*1000);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept","image/gif,image/jpeg,image/pjpeg,"
				+"application/x-shockwave-flash,application/xaml+xml,"
				+"application/vnd.ms-xpsdocument,application/x-ms-xbap,"
				+"application/x-ms-application,application/vnd.ms-excel,"
				+"application/vnd.ms-powerpoint,application/msword,*/*");
		conn.setRequestProperty("Accept-Language", "zh-CN");
		conn.setRequestProperty("Charset", "UTF-8"); 
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
