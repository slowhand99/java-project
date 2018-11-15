
import java.util.*;
import java.io.*;

public class TechnicalEvents extends Participation implements Serializable 
{
	public String TechnicalPpt;
	public String Event;

	TechnicalEvents()
	{
		TechnicalPpt= null;
		Event = null;
	}
	TechnicalEvents(String TechnicalPpt,String Event)
	{
		this.TechnicalPpt = TechnicalPpt;
		this.Event = Event;
	}
	public void Event_Details()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Event : ");
		Event = sc.next();
		System.out.println("If Participated in any such event (Y/N) : ");
		TechnicalPpt = sc.next();
	}
	public void Get_Details()
	{
		System.out.println("Event         : "+Event);
		System.out.println("Participation : "+TechnicalPpt);
	}
}
