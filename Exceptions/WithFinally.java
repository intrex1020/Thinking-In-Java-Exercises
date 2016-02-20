package Exceptions;

public class WithFinally
{
	static Switch sw = new Switch();

	public static void main(String[] args)
	{
		try
		{
			WithFinally.sw.on();
			// Code that can throw exceptions...
			OnOffSwitch.f();
			throw new RuntimeException();
		}
		catch (OnOffException1 e)
		{
			System.out.println("OnOffException1");
		}
		catch (OnOffException2 e)
		{
			System.out.println("OnOffException2");
		}
		finally
		{
			System.out.println("Here");
			WithFinally.sw.off();
		}
	}
} /*
	 * Output: on off
	 */// :~
