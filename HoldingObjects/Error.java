package HoldingObjects;

import java.util.PriorityQueue;

public class Error
{
	public static void main(String[] Args)
	{
		PriorityQueue<Err> q = new PriorityQueue<Err>();

		q.offer(new Err());
		q.offer(new Err());
		q.offer(new Err());
		q.offer(new Err());

		System.out.println(q);
	}
}

class Err extends Object
{

}
