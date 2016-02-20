package Nested;

public class NestedClass4 implements Test2
{
	@Override
	public String intMeth()
	{
		return "Hai";
	}

	public static void main(String[] Args)
	{
		new Test().testMeth(new NestedClass4());
	}
}

interface Test2
{
	String intMeth();

	// Auto pub and static
	class Test
	{
		public void testMeth(Test2 n)
		{
			System.out.println(n.intMeth());
		}
	}
}
