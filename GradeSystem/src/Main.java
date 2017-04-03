import java.awt.List;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/* Reference:
 *	 http://yaya741228.pixnet.net/blog/post/75548473-java-%E7%AD%86%E8%A8%98%EF%BC%9Ai-o%E7%9A%84%E7%B0%A1%E4%BB%8B
 * 
 * */

public class Main {
	static ArrayList<String> S = new ArrayList<>();
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("gradeinput.txt")));
			Scanner fi = new Scanner(br);
			while(fi.hasNextLine()){
				String[] tempStr = fi.nextLine().split(" ");
				for(int i=0;i<tempStr.length;i++) S.add(tempStr[i]);
			}
			/*
	        while (fi.hasNext()) {
	            if (fi.hasNextInt()) S.add(String.valueOf(fi.nextInt()));
	            else {
	            	if(fi.next().length()==1) {
	            		S.add(fi.next());
	            		S
	            	}
	            	else S.add(fi.next());
	            }
	        }*/
	        fi.close();
	        
	        Loggin ID = new Loggin(S);
	        
	        
		}
		catch(IOException e){e.printStackTrace();}
	}
	
}

