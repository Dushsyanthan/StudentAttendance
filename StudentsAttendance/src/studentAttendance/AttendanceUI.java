package studentAttendance;
import java.util.Scanner;

public class AttendanceUI extends ReportViewer{
	
	static AttendanceUI ui=new AttendanceUI();
	static Scanner inp=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("======================Students Attendance Application=============================================================");
			System.out.println("1.Add Student");
			System.out.println("2.Add Date And Mark Attendance");
			System.out.println("3.View Attendance Report");
			System.out.println("4.Exit");
			try {
			switch(inp.nextInt()) {
			case 1:inp.nextLine();ui.addDetails();break;
			case 2:ui.attendance();break;
			case 3:ui.displayReport();break;
			case 4:System.out.println("Thanks For Using Attendance Application");return;
			default :System.out.println("Enter a Valid Number ");
			}}
			catch(Exception e) {
				System.err.println("Enter Numeric Values Only");
				inp.nextLine();
			}
		}
	}
	
}
