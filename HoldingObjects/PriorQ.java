package HoldingObjects;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorQ
{
	private PriorityQueue<Double> q = new PriorityQueue<Double>();

	public void fillQ()
	{
		Random rand = new Random();

		for (int i = 0; i < 20; i++)
			q.offer(rand.nextDouble());
	}

	public void getQ()
	{
		System.out.println(q);
		for (int i = 0; i < q.size(); i++)
			System.out.println(q.poll());
	}

	public static void main(String[] Args)
	{
		PriorQ q = new PriorQ();
		q.fillQ();
		q.getQ();
	}
}
