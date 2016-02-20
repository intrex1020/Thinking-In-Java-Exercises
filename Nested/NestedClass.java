package Nested;

public class NestedClass
{
	private static class Nested
	{
		@Override
		public String toString()
		{
			return "Hey";
		}
	}

	public static void main(String[] Args)
	{
		Nested n = new Nested();
		System.out.println(n);
	}
}
