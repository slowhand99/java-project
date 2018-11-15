
import java.util.*;
import java.io.*;

public class StudentConduct implements Serializable
{
	protected String Behaviour;
	protected int misActivities;

	/* Constructors */

	StudentConduct()
	{
		this.Behaviour = "Excellent";
		this.misActivities = 0;
	
	}

	StudentConduct(String Behaviour,int misActivities)
	{
		this.Behaviour = Behaviour;
		this.misActivities = misActivities;
	}

	boolean Suspensionrecord(int misActivities)
	{
		if(misActivities>0)
			return true;
		else
			return false;
	}

	public void SetConduct(int misActivities)
	{
		if(Suspensionrecord(misActivities) == false)
		{
			Behaviour = "Excellent Conduct";
		}
		else
		{
			Behaviour = "Average conduct";
		}
	}

	/* Set Suspension */

	public void Suspensioncause()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of misactivities : ");
		misActivities = sc.nextInt();
		misActivities = misActivities+ 1;
		SetConduct(misActivities);
	}

	/* Conduct Deatails */

	public void OverallConduct()
	{
		System.out.println("Overall Conduct : "+Behaviour);
		System.out.print("Suspension Details");
		if(misActivities == 0)
		{
			System.out.println("No Suspensions given to this student!,Very good conduct");
		}
		else
		{
			System.out.println(misActivities+" Suspensions being given to the student due to misactivities in campus");
		}
	}
}
