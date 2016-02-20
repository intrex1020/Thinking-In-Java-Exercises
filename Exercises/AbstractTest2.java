package Exercises;

public class AbstractTest2
{
	public static void metodaa(Testt t)
	{
		t.metoda();
		((Testt2) t).metoda2();
	}

	public static void main(String[] Args)
	{
		AbstractTest2.metodaa(new Testt2());
	}
}

/*
 * 
 * No need to downcast when abstract method is implemented
 *
 */
abstract class Testt
{
	public abstract void metoda();
}

class Testt2 extends Testt
{
	@Override
	public void metoda()
	{
		System.out.println("Hello :)");
	}

	public void metoda2()
	{
		System.out.println("Hello M2 :)");
	}
}
