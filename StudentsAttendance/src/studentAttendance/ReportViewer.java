package studentAttendance;

public class ReportViewer extends StudentDetails {
	
	public void displayReport() {
		System.out.println("=".repeat(150));
		for(int i=0;i<sData.length;i++) {
			if(sData[i].name!=null) {
				System.out.printf("%-15s",sData[i].name);
			}
		}
		System.out.println();
		System.out.println("=".repeat(150));
		for(int i=0;i<dateCount;i++) {
			for(int j=0;j<dateAttendance[i].length;j++) {
				if(dateAttendance[i][j]!=null) {
					System.out.printf("%-15s",dateAttendance[i][j]);
				}
			}
			System.out.println();
		}
		
	}

}
