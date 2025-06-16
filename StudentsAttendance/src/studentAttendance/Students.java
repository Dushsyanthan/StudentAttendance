package studentAttendance;

public class Students {
	
	String name;
	static int count=0;
	static Students s=new Students();
	public Students() {}
	public void setName(String n) {
		name=n;
		count++;
	}
	public Students(String s) {
		name=s;
		count++;
	}
	static Students s0=new Students("StudentsName");
	static Students s1=new Students("Dushy");
	static Students s2=new Students("Abhi");
	static Students s3=new Students("Bala");
	static Students s4=new Students("Hari");
	static Students s5=new Students("Manoj");
	static Students s6=new Students("Hema");
	static Students s7=new Students("Suhira");
	static Students s8=new Students();
	static Students s9=new Students();
	static Students s10=new Students();
	
	static Students[] sData= {s0,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10}; 
	String[][] dateAttendance=new String[10][11] ;

}
