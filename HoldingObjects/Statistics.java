package HoldingObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics
{

	Map<Integer, Integer> m = new HashMap<Integer, Integer>();

	public Map<Integer, Integer> metoda()
	{
		Random rand = new Random(47);

		for (int i = 0; i < 10000; i++)
		{
			// Produce a number between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		return m;
	}

	public static void main(String[] args)
	{
		int biggest = 0;
		int which = -1;

		Statistics s = new Statistics();

		for (int i = 0; i < 1000; i++)
			s.metoda();

		for (int i : s.metoda().keySet())
			if (s.metoda().get(i) > biggest)
			{
				which = i;
				biggest = s.metoda().get(i);
			}

		System.out.println(biggest + " " + which);
		System.out.println(s.metoda());
	}
} /*
	 * Output: {15=497, 4=481, 19=464, 8=468, 11=531, 16=533, 18=478, 3=508,
	 * 7=471, 12=521, 17=509, 2=489, 13=506, 9=549, 6=519, 1=502, 14=477,
	 * 10=513, 5=503, 0=481}
	 */// :~
