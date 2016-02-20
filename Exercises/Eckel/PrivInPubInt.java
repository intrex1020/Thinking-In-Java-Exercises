package Exercises.Eckel;

interface Interfejs4
{
	void innerMeth();
}

public class PrivInPubInt
{
	public static void main(String[] Args)
	{
		NowaKlasa i = new NowaKlasa();
		Interfejs4 j = i.retInt();
		// Inner is hidden cant downcast
		// (Inner)j.innerMeth();
		j.innerMeth();
		i.retInt().innerMeth();
	}
}

class NowaKlasa
{
	private class Inner implements Interfejs4
	{
		@Override
		public void innerMeth()
		{

		}
	}

	public Interfejs4 retInt()
	{
		return new Inner();
	}
}
