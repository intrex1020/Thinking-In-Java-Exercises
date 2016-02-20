package HoldingObjects;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex1
{
	private int gebrilNumber;

	public Ex1(int i)
	{
		gebrilNumber = i;
	}

	public int hop()
	{
		return gebrilNumber;
	}

	public static void main(String[] Args)
	{
		Map<String, Ex1> mapa = new LinkedHashMap<String, Ex1>();

		mapa.put("Dingo", new Ex1(2));
		mapa.put("Sammey", new Ex1(5));
		mapa.put("Marco", new Ex1(1));

		Iterator<String> it = mapa.keySet().iterator();

		while (it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
			System.out.println(mapa.get(s).hop());
		}

		for (String s : mapa.keySet())
		{
			System.out.println(s);
			System.out.println(mapa.get(s).hop());
		}
	}
}
