package Exercises;

public class Detergent
{
	private String s = "Detergent";

	public void append(String a)
	{
		s += a;
	}

	public void dilute()
	{
		append(" dilute()");
	}

	public void apply()
	{
		append(" apply()");
	}

	public void scrub()
	{
		append(" scrub()");
	}

	@Override
	public String toString()
	{
		return s;
	}

	public static void main(String[] Args)
	{
		Detergent x = new Detergent();
		new Cleanser("Kret");
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

class Cleanser
{
	private String name;
	private Detergent d = new Detergent();

	public Cleanser(String name)
	{
		this.name = name;
	}

	public void scrub()
	{
		d.append(" Detergent.scrub()");
	}

	public void foam()
	{
		d.append(" foam()");
	}
}
