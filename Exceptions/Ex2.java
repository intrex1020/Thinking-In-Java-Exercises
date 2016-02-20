package Exceptions;

public class Ex2
{
	public static void main(String[] Args)
	{
		Ex2 e = new Ex2();
		String s = null;

		try
		{
			e.metoda(s);
		}
		catch (NullPointerException ex)
		{
			System.err.println(ex.getMessage() + " WAT");
		}
	}

	public void metoda(String e) throws NullPointerException
	{
		if (e == null)
			throw new NullPointerException();
	}
}
