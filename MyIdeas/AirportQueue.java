package MyIdeas;

import java.util.Comparator;
import java.util.PriorityQueue;

public class AirportQueue
{
	private static PriorityQueue<Plane> queue = new PriorityQueue<Plane>(10, AirportQueue.compare());

	public void add(Plane plane)
	{
		AirportQueue.queue.offer(plane);
	}

	public static Comparator<Plane> compare()
	{
		return new Comparator<Plane>()
		{
			@Override
			public int compare(Plane p1, Plane p2)
			{
				if (p1.getPriority() > p2.getPriority())
					return 1;
				else if (p1.getPriority() < p2.getPriority())
					return -1;
				else if (p1.getTime() < p2.getTime())
					return 1;
				else
					return 0;
			}
		};
	}

	public void systemRestart()
	{
		AirportQueue.queue.clear();
	}

	public void landed()
	{
		AirportQueue.queue.poll();
	}

	public PriorityQueue<Plane> getQueue()
	{
		return AirportQueue.queue;
	}

	public static void main(String[] Args)
	{
		AirportQueue q = new AirportQueue();

		q.add(new BigCargoPlane());
		q.add(new SmallPlane());
		q.add(new BigPlane());
		q.add(new SmallCargoPlane());
		// Adding delay
		long l = 0;
		while (l != 1000000000)
			l++;
		q.add(new BigPlane());

		System.out.println(q.getQueue());
		q.landed();
		q.landed();
		q.landed();
		System.out.println(q.getQueue());
	}
}

abstract class Plane
{
	private int priority;
	private long time;

	public Plane(int priority, long time)
	{
		this.priority = priority;
		this.time = time;
	}

	public long getTime()
	{
		return time;
	}

	public int getPriority()
	{
		return priority;
	}

	@Override
	public abstract String toString();
}

class SmallPlane extends Plane
{
	public SmallPlane()
	{
		super(2, System.currentTimeMillis());
	}

	@Override
	public String toString()
	{
		return "Small plane";
	}
}

class BigPlane extends Plane
{
	public BigPlane()
	{
		super(1, System.currentTimeMillis());
	}

	@Override
	public String toString()
	{
		return "Big plane";
	}
}

class SmallCargoPlane extends Plane
{
	public SmallCargoPlane()
	{
		super(3, System.currentTimeMillis());
	}

	@Override
	public String toString()
	{
		return "Small cargo plane";
	}
}

class BigCargoPlane extends Plane
{
	public BigCargoPlane()
	{
		super(4, System.currentTimeMillis());
	}

	@Override
	public String toString()
	{
		return "Big cargo plane";
	}
}