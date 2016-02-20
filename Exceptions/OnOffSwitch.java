package Exceptions;

public class OnOffSwitch
{
	private static Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2
	{
	}

	public static void main(String[] args)
	{
		try
		{
			OnOffSwitch.sw.on();
			// Code that can throw exceptions...
			OnOffSwitch.f();
			OnOffSwitch.sw.off();
			throw new RuntimeException();
		}
		catch (OnOffException1 e)
		{
			System.out.println("OnOffException1");
			OnOffSwitch.sw.off();
		}
		catch (OnOffException2 e)
		{
			System.out.println("OnOffException2");
			OnOffSwitch.sw.off();
		}
	}
} /*
	 * Output: on off
	 */// :~
