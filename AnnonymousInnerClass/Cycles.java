package AnnonymousInnerClass;

interface Cycle
{
	void ride();
}

interface CycleFactory
{
	Cycle getCycle();
}

class Unicycle implements Cycle
{
	public static CycleFactory factory = new CycleFactory()
	{
		@Override
		public Cycle getCycle()
		{
			return new Unicycle();
		}
	};

	@Override
	public void ride()
	{
		System.out.println("Ride Unicycle");
	}
}

class Bicycle implements Cycle
{
	public static CycleFactory factory = new CycleFactory()
	{
		@Override
		public Cycle getCycle()
		{
			return new Bicycle();
		}
	};

	@Override
	public void ride()
	{
		System.out.println("Ride Bicycle");
	}
}

class Tricycle implements Cycle
{
	public static CycleFactory factory = new CycleFactory()
	{
		@Override
		public Cycle getCycle()
		{
			return new Tricycle();
		}
	};

	Tricycle()
	{
		System.out.println("Tricycle()");
	}

	@Override
	public void ride()
	{
		System.out.println("Ride Tricycle");
	}
}

public class Cycles
{
	public static void rideCycle(CycleFactory factory)
	{
		Cycle c = factory.getCycle();
		c.ride();
	}

	public static void main(String[] args)
	{
		Cycles.rideCycle(Unicycle.factory);
		Cycles.rideCycle(Bicycle.factory);
		Cycles.rideCycle(Tricycle.factory);
	}
}