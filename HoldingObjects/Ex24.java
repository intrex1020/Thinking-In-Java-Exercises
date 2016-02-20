package HoldingObjects;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ex24
{
	public static void main(String[] Args)
	{
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Han", 1);
		map.put("Donkey", 2);
		map.put("Kan", 3);
		map.put("Chan", 4);

		List<String> set = new LinkedList<String>();

		for (String s : map.keySet())
			set.add(s);

		Collections.sort(set);

		Map<String, Integer> map1 = new LinkedHashMap<String, Integer>();

		for (String s : set)
		{
			map1.put(s, map.get(s));
			map.remove(s);
		}

		for (String s : map1.keySet())
		{
			int i = map1.get(s);
			map.put(s, i);
		}

		map1.clear();
		System.out.println(map);
	}
}
