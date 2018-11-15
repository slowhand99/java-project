
import java.util.*;
import java.io.*;

/* Student Details Class */

class Student extends StudentInformation implements Serializable
{
	
	String rollno;  //Roll Number of Student
	String name;        //Name of Student
	String Address;     //Address of type String
	String Branch;      //Branch
	String studentType; //Hostler or DayScholar  (H) OR (D)
	int flag = 0;  //Flag 

	Student(String r,String n,String a,String brch,String st)
	{
		this.rollno = r;
		this.name = n;
		this.Address = a;
		this.Branch = brch;
		this.studentType = st;
	}

	Student()
	{
		rollno = null;
		name = null;
		Address = null;
		Branch = null;
		studentType = null;
	}

	public void setMethod(String r,String n,String a,String brch,String st)
	{
		rollno = r;
		name = n;
		Address =a;
		Branch = brch;
		studentType = st;
	}

	public String getRoll()
	{
		return rollno;
	}

	public void get_Details()  //Abstract Method Invoked from Abstract Base Class Information
	{
		System.out.println("<<<<<<<------Student Details------>>>>>>");
		System.out.println("Name            : "+name);
		System.out.println("RollNumber      : "+rollno);
		System.out.println("Branch          : "+Branch);
		System.out.println("Address         : "+Address);
		System.out.println("Student Type    : "+studentType);
	}

}
