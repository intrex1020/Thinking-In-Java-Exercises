package HouseControls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Controller
{
	private List<Event> eventList = new ArrayList<Event>();

	public void addEvent(Event c)
	{
		eventList.add(c);
	}

	public void run()
	{
		LinkedList<Event> eventListCopy = new LinkedList<Event>(eventList);
		ListIterator<Event> it = eventListCopy.listIterator();

		while (it.hasNext())
		{
			it.next().action();
			it.previous();
			System.out.println(it.next());
			it.remove();
		}
	}
}
