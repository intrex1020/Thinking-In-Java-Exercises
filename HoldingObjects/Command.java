package HoldingObjects;

import java.util.LinkedList;
import java.util.Queue;

public class Command
{
	private String s = "This is a string";
	private int i;

	public Command(int i)
	{
		this.i = i;
	}

	public void operation()
	{
		System.out.println(s);
	}

	public static void main(String[] Argos)
	{
		new Consume();
	}

	@Override
	public String toString()
	{
		return s + " " + i;
	}
}

class Qfill
{
	Queue<Command> q = new LinkedList<Command>();

	public Queue<Command> fill()
	{
		for (int i = 0; i < 10; i++)
			q.offer(new Command(i));
		System.out.println(q);
		return q;
	}
}

class Consume
{
	private Qfill q = new Qfill();

	public Consume()
	{
		metoda(q.fill());
	}

	public void metoda(Queue<Command> q)
	{
		q.poll().operation();
		System.out.println(q);
	}
}
