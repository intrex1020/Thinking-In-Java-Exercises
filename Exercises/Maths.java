package Exercises;

public class Maths
{

	public static void main(String[] args)
	{
		new Maths();
		System.out.println((0 * 4) + (1 * 4) + (2 * 4) + (3 * 4));
	}

	public double f(double x)
	{
		return x + x;
	}

	public double g(double x)
	{
		return (x - 5) * 2;
	}

	public boolean c(double d)
	{
		return d > 20;
	}

	public double h(double d)
	{
		return d / 7;
	}

	public double rec(double x, double y)
	{
		double result = 0;

		if (x == 0)
			result = 0;
		else
			result = rec(x - 1, y) + (x * y);
		return result;
	}

}
