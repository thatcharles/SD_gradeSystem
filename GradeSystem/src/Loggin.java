import java.util.ArrayList;
import java.util.Scanner;

public class Loggin{
	public String input;
	
	public Loggin(ArrayList<String> S) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
	    System.out.println("��JID�� Q (�����ϥ�)�H"); //輸入ID或 Q (結束使用)？
	    String input = reader.next();//input = ID or Q.
	    
	    if(input.equals("Q"))	 System.out.println("�����{��");
        else	searchID(S,input);
	}
	
    
    private void searchID(ArrayList<String> S, String input){
    	int flag=1;
       //input = ID.
    	for(int i=0;i<S.size();i++){
    		if(S.get(i).equals(input)){
    			MainTable  choice= new MainTable();
    			choice.commandTable(S,i);
    			flag=0;
    			break;
    		}
    	}
    	if(flag==1) 	System.out.println("���򳣨S��");
        
    }





    
}

