package studentAttendance;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDetails extends Students {
	static Scanner inp=new Scanner(System.in);
	static int dateCount=0;
	public void addDetails() {
		if(count<=10) {
			int times=1;
			for(int i=count;i<sData.length && times==1;i++) {
				System.out.println("Enter the Student Name as "+i+" in the List");
				String n=inp.nextLine();
				sData[i].setName(n);
				times++;
			}
			System.out.println("Student Name Added");
		}
		else {
			System.err.println("Student List is Already Full");
		}
	}
	
	public void attendance() {
		System.out.println("Enter the Date in (dd/mm/yy) Format :" );
		String s=inp.nextLine();
		try {
		if(dateCount<dateAttendance.length) {
		dateAttendance[dateCount++][0]=s;
		System.out.println("Students Name Will be Displayed \nPress 1 to Mark Present and Any Number  For Absent");
		for(int i=1;i<dateAttendance.length;i++) {
			if(sData[i].name!=null) {
			System.out.print(sData[i].name+" :");
			int n=inp.nextInt();
			if(n==1) {
				dateAttendance[dateCount-1][i]="Present";
			}
			else {
				dateAttendance[dateCount-1][i]="Absent";
			}
			}
		}
		}
		else {
			System.out.println("Attendance Sheet is Full");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a Numeric Values Only");
			inp.nextLine();
			dateCount=dateCount-1;
			 attendance();
		}
	}
}
