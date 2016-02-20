package Exercises;

public class Upcasting
{
	public static void ride(Cycle c)
	{
		Cycle.travel(c);
		System.out.println("Wheels " + c.wheels());
	}

	public static void downcastTest(Cycle c)
	{
		((Unicycle) c).downcast(); // Downcast
	}

	public static void main(String[] args)
	{
		Cycle cycle = new Cycle();
		Cycle uni = new Unicycle();
		Cycle tri = new Tricycle();
		Cycle bi = new Bicycle();

		Upcasting.ride(cycle);
		Upcasting.ride(uni);
		Upcasting.downcastTest(uni);
		Upcasting.ride(tri);
		Upcasting.ride(bi);
	}
}

class Cycle
{
	private String name = "Cycle";
	private int wheels = 0;

	public static void travel(Cycle c)
	{
		System.out.println("Cycle.ride() " + c);
	}

	public int wheels()
	{
		return wheels;
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Unicycle extends Cycle
{
	private String name = "Unicycle";
	private int wheels = 1;

	public void downcast()
	{
		System.out.println("Downcasted");
	}

	@Override
	public int wheels()
	{
		return wheels;
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Bicycle extends Cycle
{
	private String name = "Bicycle";
	private int wheels = 2;

	@Override
	public int wheels()
	{
		return wheels;
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Tricycle extends Cycle
{
	private String name = "Tricycle";
	private int wheels = 3;

	@Override
	public int wheels()
	{
		return wheels;
	}

	@Override
	public String toString()
	{
		return name;
	}
}