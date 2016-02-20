package Exceptions;

public class Ex1
{
	public static void main(String[] Args)
	{
		try
		{
			throw new Exception("String Argument");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I was here");
		}
	}
}
