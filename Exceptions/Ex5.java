package Exceptions;

import java.util.Scanner;

public class Ex5
{
	public static void main(String[] Args)
	{
		Ex5 e = new Ex5();
		Scanner scan = new Scanner(System.in);
		boolean exception = true;

		while (exception)
			try
			{
				e.metoda(scan.nextInt());
				exception = false;
				scan.close();
			}
			catch (Exception ee)
			{
				System.err.println(ee.getMessage());
			}
	}

	public void metoda(int i) throws Exception
	{
		if (i != 5)
			throw new Exception("Illegal argument, expected 5");
	}
}
