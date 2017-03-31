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
	        loggin(S);
		}
		catch(IOException e){e.printStackTrace();}
	}
	
	public static void loggin(ArrayList<String> S){
		Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("輸入ID或 Q (結束使用)？");
        String input = reader.next();
        int flag=1;
        if(input.equals("Q")) System.out.println("結束程式");
        else{
        	for(int i=0;i<S.size();i++){
        		if(S.get(i).equals(input)){
        			mainTable(S,i);
        			flag=0;
        			break;
        		}
        	}
        	if(flag==1) System.out.println("什麼都沒有");
        }
	}
	
	public static void mainTable(ArrayList<String> S, int ID) {
		System.out.println("Welcome "+ S.get(ID+1));
		while(true){
			System.out.print("\n"+"	輸入指令1) G 顯示成績 (Grade)\n"+"		2) R 顯示排名 (Rank)\n"+"		3) A 顯示平均 (Average)\n"+"		4) W更新配分 (Weight)\n"+"		5) E 離開選單 (Exit)\n");
			Scanner reader2 = new Scanner(System.in);
			String input2 = reader2.next();
			int flag=0;
			switch(input2){
			case "G":
				System.out.println("顯示成績 (Grade)");
				break;
			case "R":
				System.out.println("顯示排名 (Rank) ");
				break;
			case "A":
				System.out.println("顯示平均 (Average)");
				break;
			case "W":
				System.out.println("更新配分 (Weight)");
				break;
			case "E":
				System.out.println("離開選單 (Exit)");
				loggin(S);
				flag = 1;
				break;
			}
			if(flag==1)break;
		}
	}
}

