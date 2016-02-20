package AnnonymousInnerClass;

interface Interfejs5
{
	void interMeth(String s);

	void interMeth2();
}

public class AnnonClass2
{
	public Interfejs5 annonMeth(final String h)
	{
		return new Interfejs5()
		{
			@Override
			public void interMeth(String s)
			{
				System.out.println(s);
			}

			@Override
			public void interMeth2()
			{
				System.out.println(h);
			}
		};
	}

	public static void main(String[] Args)
	{
		AnnonClass2 a = new AnnonClass2();
		a.annonMeth("Hi").interMeth("Hi");
		a.annonMeth("Hello").interMeth2();
	}
}
