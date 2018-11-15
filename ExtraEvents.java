import java.util.*;
import java.io.*;

public class ExtraEvents extends Participation implements Serializable 
{
	public String Gift;
	public String Event;
	public String Event_Type;

	ExtraEvents()
	{
		Gift = null;
		Event = null;
		Event_Type = null;
	}
	ExtraEvents(String Gift,String Event,String Event_Type)
	{
		this.Gift = Gift;
		this.Event_Type = Event_Type;
		this.Event = Event;
	}
	public void Event_Details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Cultural Event Name : ");
		Event = sc.next();
		System.out.println("Enter The Cultural Event Type: ");
		Event_Type = sc.next();
		System.out.println("Enter The Gift Received : ");
		Gift = sc.next();
	}
	public void Get_Details()
	{
		System.out.println("Cultural Event Name : "+Event);
		System.out.println("Cultural Event Type : "+Event_Type);
		System.out.println("Gift Received       : "+Gift);
	}
}