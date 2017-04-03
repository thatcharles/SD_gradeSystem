import java.util.ArrayList;
import java.util.Scanner;

public class Command {
	
	public void showGrades(ArrayList<String> s, int id){
		System.out.print(s.get(id+1)+"成績:");
		
		for(int i=0;i<5;i++)
			System.out.println("lab"+i+"：     "+s.get(id+i));
	}
	
	public void showRanking(ArrayList<String> s, int id){
		System.out.print(s.get(id+1)+"排名第");
		
		
		
	}
}
