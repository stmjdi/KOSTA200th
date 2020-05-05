package univView;

import univController.*;
import univModels.*;
import java.util.Scanner;


public class MainEntry {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		AbsController abc;
		int op=0; int chs;
		while(op!=3) {
			System.out.println("Choose a mode you want to handle");
			System.out.println("1. Employees Datas    2. Educational People Datas   3. Exit the Program");
			op=sc.nextInt();
			
			switch(op) {
			case 1:
				abc=new EmpController();
				System.out.println("Select an item to do (1.Employees  2.Departments)");
				chs=sc.nextInt();
				
				if(chs==1) abc.operControl(new EmpModel());
				else if(chs==2) abc.operControl(new DepartModel());
				
				break;
			case 2:
				abc=new MajorController();
				System.out.println("Select an item to do (1.Majors  2.Professors  3.Students)");
				chs=sc.nextInt();
				
				if(chs==1) abc.operControl(new MajorModel());
				else if(chs==2) abc.operControl(new ProfessorModel());
				else if(chs==3) abc.operControl(new StudentModel());
				
				break;
			case 3:
				System.out.println("...Exit the Program...");
				break;
			default: System.out.println("not-allowed number is typed. try again.");
			}
		}
		
		sc.close();
	}
}
