package Exercises.Eckel;

interface Interfejs
{
	int innerMet();
}

public class Outer
{
	private int i;
	private String s;

	public Outer()
	{
		i = 1;
		s = "arbuz";
	}

	// Can alos set protected/private
	public class Inner implements Interfejs
	{
		// Reference to outer
		public Outer innerOutRef()
		{
			return Outer.this;
		}

		@Override
		public String toString()
		{
			return s;
		}

		@Override
		public int innerMet()
		{
			return i;
		}
	}

	public void outerMeth()
	{

	}

	public Inner innerRef()
	{
		i++;
		return new Inner();
	}

	public static void main(String[] Args)
	{
		// Going into inner
		Outer o = new Outer();
		Outer.Inner h = o.innerRef();
		o.new Inner();
		// W/o upcast
		Inner i = o.innerRef();
		// Inner p = o.new innerRef();
		// Outer.Inner p = new Inner();
		// Outer.Inner j = new Outer.Inner();
		h.innerMet();
		// j.innerMet();
		i.innerMet();
		o.innerRef();
		// Method must be in an interface and then
		// be implemented in method in a class that
		// implement this interface
		// Interface upcast
		Interfejs interf = o.innerRef();
		System.out.println(i);
		System.out.println(i);
		System.out.println(interf);
		System.out.println(interf.innerMet());
		h.innerOutRef().outerMeth();
	}
}
