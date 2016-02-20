package Exercises;

/*
 * Initialization with abstract class constructor.
 */
public class AbstractTest
{
	public static void main(String[] Args)
	{
		Prynt pry = new Prynt2();
		pry.print();
	}
}

abstract class Prynt
{
	public Prynt()
	{
		System.out.println("Here");
		print();
		System.out.println("Here2");
	}

	public abstract void print();
}

class Prynt2 extends Prynt
{
	private int i = 2;

	@Override
	public void print()
	{
		System.out.println("Here3");
		System.out.println(i);
	}
}
