package HoldingObjects;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.mindview.util.TextFile;

public class Ex25
{
	public static void main(String[] Args)
	{
		Map<String, ArrayList<Integer>> map = new LinkedHashMap<String, ArrayList<Integer>>();
		Map<String, ArrayList<Integer>> map1 = new LinkedHashMap<String, ArrayList<Integer>>();
		List<String> list = new ArrayList<String>();
		list.addAll(new TextFile("C:\\Users\\Intrex\\Desktop\\New folder (2)\\holding\\SetOperations.java", "\\W+"));

		int count = 0;
		for (String s : list)
		{
			count++;
			if (!map.containsKey(s))
			{
				ArrayList<Integer> l = new ArrayList<Integer>();
				l.add(0, count);
				map.put(s, l);
			}
			else
			{
				map.get(s).add(0, count);
				map.put(s, map.get(s));
			}
		}

		for (String s : map.keySet())
		{
			ArrayList<Integer> tmp = map.get(s);
			// map.remove(s);
			map1.put(s, tmp);
		}

		System.out.println(map1);
		System.out.println(list);
	}
}
