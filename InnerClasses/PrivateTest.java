package InnerClasses;

public class PrivateTest
{
	private int i = 1;

	private class Inner
	{
		// To use in outer need get/set
		private int j = 2;

		private void innerMeth()
		{
			i++;
			outerMeth();
		}
	}

	public Inner innerRef()
	{
		return new Inner();
	}

	private void outerMeth()
	{
		System.out.println(i);
	}

	public void outerMeth2()
	{
		PrivateTest p = new PrivateTest();
		PrivateTest.Inner i = p.innerRef();
		i.innerMeth();
	}

	public static void main(String[] Args)
	{
		PrivateTest p = new PrivateTest();
		p.outerMeth2();
	}
}
