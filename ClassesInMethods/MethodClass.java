package ClassesInMethods;

interface Interfejs1
{
	void dest();
}

public class MethodClass
{
	public Interfejs1 where(String s)
	{
		class ClassMetd implements Interfejs1
		{
			private String label;

			ClassMetd(String where)
			{
				label = where;
			}

			@Override
			public void dest()
			{
				System.out.println(label);
			}
		}
		return new ClassMetd(s);
	}

	public static void main(String[] Args)
	{
		MethodClass c = new MethodClass();
		c.where("UK");
	}

}