package HoldingObjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex19
{
	public static void main(String[] Args)
	{
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();

		Collections.addAll(set1, "Jeden", "Dwa", "Trzy", "Cztery", "Piec", "Szesc");

		System.out.println(set1);

		Set<String> set3 = new TreeSet<String>(set1);

		System.out.println(set3);

		for (String s : set3)
			set2.add(s);

		System.out.println(set2);
	}
}
