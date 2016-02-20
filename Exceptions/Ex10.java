package Exceptions;

class ExceptionIsLove extends Exception
{
}

public class Ex10
{

	public void f() throws RuntimeException
	{
		try
		{
			g();
		}
		catch (ExceptionIsLove e)
		{
			throw new RuntimeException(e);
		}
	}

	public void g() throws ExceptionIsLove
	{
		throw new ExceptionIsLove();
	}

	public static void main(String[] Args)
	{
		Ex10 e = new Ex10();

		e.f();
	}
}
