package Exceptions;

public class Ex3
{
	public static void main(String[] Args)
	{
		int[] ia = {1, 2};

		try
		{
			ia[2] = 3;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			new Logging(e);
		}
	}
}
