package Exceptions;

class ExceptionA extends Exception
{
	ExceptionA(String msg)
	{
		super(msg);
	}
}

class ExceptionB extends Exception
{
	ExceptionB(String msg)
	{
		super(msg);
	}
}

class ExceptionC extends Exception
{
	ExceptionC(String msg)
	{
		super(msg);
	}
}

public class Ex9
{
	public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC
	{
		if (x < 0)
			throw new ExceptionA("x < 0");
		if (x == 0)
			throw new ExceptionB("x == 0");
		if (x > 0)
			throw new ExceptionC("x > 0");
	}

	public static void main(String[] args)
	{
		try
		{
			// Ex9.f(0);
			// Ex9.f(1);
			// Ex9.f(-1);
			// will catch any Exception type:
			throw new NullPointerException();
		}
		catch (Exception e)
		{
			System.out.print("Caught Exception");
			e.printStackTrace(System.out);
		}
		finally
		{
			System.out.println("I was executed");
		}
	}
}