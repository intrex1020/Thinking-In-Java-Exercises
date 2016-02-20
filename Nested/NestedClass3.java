package Nested;

interface NestedClass3
{
	void hi();

	// Auto public static
	class Test
	{
		public void hi()
		{
			System.out.println("Hi");
		}
	}

	public static void main(String[] Args)
	{
		NestedClass3.Test t = new NestedClass3.Test();
		t.hi();
		new Test().hi();
	}
}
