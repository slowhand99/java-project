
import java.util.*;
import java.io.*;

public class OtherEvents extends Participation implements Serializable
{
	public String Award;
	public String Event_Name;
	public String Event_Type;

	OtherEvents()
	{
		Award = null;
		Event_Type = null;
		Event_Name = null;
	}
	OtherEvents(String Award,String Event_Name,String Event_Type)
	{
		this.Award = Award;
		this.Event_Type = Event_Type;
		this.Event_Name = Event_Name;
	}
	public void Event_Details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Event Name : ");
		Event_Name = sc.next();
		System.out.println("Enter The Event Type: ");
		Event_Type = sc.next();
		System.out.println("Enter The Price Received : ");
		Award = sc.next();
	}
	public void Get_Details()
	{
		System.out.println("Event Name    : "+Event_Name);
		System.out.println("Event Type    : "+Event_Type);
		System.out.println("Gift Received : "+Award);
	}
}
