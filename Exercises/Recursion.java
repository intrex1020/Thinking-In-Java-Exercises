package Exercises;

public class Recursion
{

	public static void main(String[] args)
	{
		Recursion rec = new Recursion();
		// System.out.println(rec.recursion(2*(10+1)));
		System.out.println(rec.rec1(Integer.MAX_VALUE));
	}

	public int recursion(int i)
	{
		int result = 0;

		if (i == 0)
			result = 0;
		else
			result = recursion(i - 1) + 2;
		return result;
	}

	public double rec1(int i)
	{
		if (i == 0)
			return 0;
		else
			return rec1(i - 1) + 2;
	}
}