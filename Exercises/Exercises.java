package Exercises;

public class Exercises
{
	public enum test
	{
		DONG, RUPIAH, PESO, SHILLING, WON, FORINT
	}

	public static void main(String... args)
	{
		for (test t : test.values())
			switch (t)
			{
				case DONG:
					System.out.print("Dong");
					break;
				case RUPIAH:
					System.out.print("Rupiah");
					break;
				case PESO:
					System.out.print("Peso");
					break;
				case SHILLING:
					System.out.print("Shilling");
					break;
				case WON:
					System.out.print("WON");
					break;
				case FORINT:
					System.out.print("FORINT");
					break;
			}
	}
}
