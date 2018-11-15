import java.util.*;
import java.io.*;

class StudentPrevRecords extends StudentInformation implements Serializable
{
	public String MatriculationMarks;
	public String Boards12Marks;
	public String Syllabus;
	public String Entrance_Rank;

	StudentPrevRecords()
	{	
		this.MatriculationMarks= null;
		this.Boards12Marks =null;
		this.Syllabus = null;
		this.Entrance_Rank = null;
	}

	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("<<<<<<<<----Result History---->>>>>>>");
		System.out.println("Enter Matriculation Percentage : ");
		MatriculationMarks= sc.next();
		System.out.println("Enter 12th STD Percentage : ");
		Boards12Marks= sc.next();
		System.out.println("Enter SyllabusFollowed : ");
		Syllabus = sc.next();
		System.out.println("Enter Entrance_Rank : ");
		Entrance_Rank = sc.next();
	}

	public void get_Details()
	{
		System.out.println("********STUDENT HISTORY**********");
		System.out.println("Matriculation Percentage : "+MatriculationMarks);
		System.out.println("12th STD Percentage      : "+Boards12Marks);
		System.out.println("SyllabusFollowed         : "+Syllabus);
		System.out.println("Entrance_Rank Obtained   : "+Entrance_Rank);
	}

}
