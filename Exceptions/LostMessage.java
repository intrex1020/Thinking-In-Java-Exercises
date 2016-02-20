package Exceptions;

class VeryImportantException extends Exception
{
	@Override
	public String toString()
	{
		return "A very important exception!";
	}
}

class HoHumException extends VeryImportantException
{
	@Override
	public String toString()
	{
		return "A trivial exception";
	}
}

class OverrideException extends VeryImportantException
{
	@Override
	public String toString()
	{
		return "Overrided exception";
	}
}

class NewEx extends OverrideException
{

}

class Exx extends Exception
{
}

class ex extends LostMessage
{
	public ex() throws NewEx, HoHumException, Exx
	{
	}

	@Override
	void f() throws NewEx
	{

	}
}

public class LostMessage
{
	public LostMessage() throws NewEx
	{
	}

	void f() throws VeryImportantException, HoHumException
	{
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException
	{
		throw new HoHumException();
	}

	void metoda() throws OverrideException
	{
		throw new OverrideException();
	}

	public static void main(String[] args)
	{
		try
		{
			LostMessage lm = new LostMessage();
			try
			{
				try
				{
					lm.f();
				}
				catch (Exception e)
				{
					System.err.println(e);
				}
				finally
				{
					lm.dispose();
				}
			}
			catch (Exception e)
			{
				System.err.println(e);
			}
			finally
			{
				lm.metoda();
			}
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
} /*
	 * Output: A trivial exception
	 */// :~
