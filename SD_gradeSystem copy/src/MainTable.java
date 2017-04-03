import java.util.ArrayList;
import java.util.Scanner;

public class MainTable{
	
	public void commandTable(ArrayList<String> S, int ID) {
		System.out.println("Welcome "+ S.get(ID+1));
		while(true){
			System.out.print("\n"+"	��J���O1) G ��ܦ��Z (Grade)\n"+"		2) R ��ܱƦW (Rank)\n"+"		3) A ��ܥ��� (Average)\n"+"		4) W��s�t�� (Weight)\n"+"		5) E ���}��� (Exit)\n");
			Scanner reader2 = new Scanner(System.in);
			String input2 = reader2.next();
			int flag=0;
			
			Command choice = new Command();
			switch(input2){						
			case "G"://顯示成績
				System.out.println("��ܦ��Z (Grade)");
				choice.showGrades(S,ID);
				break;
			case "R"://顯示排名
				System.out.println("��ܱƦW (Rank) ");
				choice.showRanking(S,ID);
				break;
			case "A"://顯示平均
				System.out.println("��ܥ��� (Average)");
				break;
			case "W"://更新分配
				System.out.println("��s�t�� (Weight)");
				break;
			case "E"://離開選單
				System.out.println("���}��� (Exit)");
				Loggin againID = new Loggin();
		        againID.requestID(S);
				flag = 1;
				break;
			}
			if(flag==1)break;
		}
	}
	

	
	
}

