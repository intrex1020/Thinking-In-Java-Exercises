package Exercises;

public class Finalizetest
{
	private int howFull = 0;

	Finalizetest()
	{
		this(0);
	}

	Finalizetest(int fill)
	{
		howFull = fill;
	}

	public static void main(String[] Args)
	{
		Finalizetest t1 = new Finalizetest(0);
		Finalizetest t2 = new Finalizetest(3);
		Finalizetest t3 = new Finalizetest(5);
		t2.empty();
		t1.sayHowFull();
		t2.sayHowFull();
		t3.sayHowFull();
		// Not cleaned up
		new Finalizetest(6);
		System.gc();
	}

	public void sayHowFull()
	{
		if (howFull == 0)
			System.out.println("Tank is empty");
		else
			System.out.println("Tank filling status = " + howFull);
	}

	public void empty()
	{
		howFull = 0;
	}

	@Override
	protected void finalize()
	{
		if (howFull != 0)
			System.out.println("Message");
	}
}
