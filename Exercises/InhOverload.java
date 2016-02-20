package Exercises;

public class InhOverload
{
	public static void main(String[] Args)
	{
		InOverload i = new InOverload();
		i.asd();
		i.asd('c');
		i.asd(5.0);
		i.asd(2);
	}
}

class InOverload extends OnOverload
{
	public void asd(char c)
	{
		System.out.println("asd c");
	}
}

class OnOverload
{
	public void asd()
	{
		System.out.println("asd");
	}

	public void asd(int i)
	{
		System.out.println("asd i");
	}

	public void asd(double d)
	{
		System.out.println("asd d");
	}
}
