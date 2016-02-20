package AnnonymousInnerClass;

import InnerClasses.PrivateTest;

interface Inner
{
	void innerMeth();
}

public class AnonClass
{
	private int i = 1;

	public Inner anonInn()
	{
		return new Inner()
		{
			private int j = 2;

			@Override
			public void innerMeth()
			{
				i++;
				outerMeth();
			}
		};
	}

	private void outerMeth()
	{
		System.out.println(i);
	}

	public void outerMeth2()
	{
		AnonClass p = new AnonClass();
		p.anonInn().innerMeth();
	}

	public static void main(String[] Args)
	{
		PrivateTest p = new PrivateTest();
		p.outerMeth2();
	}
}
