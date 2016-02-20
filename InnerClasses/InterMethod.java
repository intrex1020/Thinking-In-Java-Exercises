package InnerClasses;

interface Interfejs3
{
	void metoda();
}

public class InterMethod
{
	public void intRefRet()
	{
		if (true)
		{
			class Klasa implements Interfejs3
			{
				private String s = "Success";

				@Override
				public void metoda()
				{
				}

				@Override
				public String toString()
				{
					return s;
				}
			}
			new Klasa();
		}
	}

	public static void main(String[] Args)
	{
		InterMethod i = new InterMethod();
		i.intRefRet();
	}
}
