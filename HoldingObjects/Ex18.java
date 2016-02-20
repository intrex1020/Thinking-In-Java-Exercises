package HoldingObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex18
{
	public static void main(String[] Args)
	{
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();

		map1.put("Han", 1);
		map1.put("Donkey", 2);
		map1.put("Kan", 3);
		map1.put("Chan", 4);

		Iterator<String> it = map1.keySet().iterator();

		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
			System.out.print(map1.get(s) + " " + s.hashCode() + "\n");
		}

		Set<String> keySort = new TreeSet<String>();

		for (String s : map1.keySet())
			keySort.add(s);

		System.out.println(keySort);

		for (String s : keySort)
			map2.put(s, map1.get(s));

		System.out.println(map2);

		Map<String, Integer> map3 = new TreeMap<String, Integer>(map1);

		System.out.println(map3);
	}
}
