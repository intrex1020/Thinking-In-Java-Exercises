package HoldingObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex4
{
	private int key;

	public String next()
	{
		switch (key)
		{
			default:
			case 0:
				key++;
				return "Aladin";
			case 1:
				key++;
				return "Kanbaru";
			case 2:
				key++;
				return "Senjougahara";
			case 3:
				key++;
				return "Koyomi";
			case 4:
				key++;
				return "Saber";
			case 5:
				key++;
				return "Archer";
			case 6:
				key++;
				return "Wescer";
			case 7:
				key = 0;
				return "Ynd";
		}
	}

	public String[] fillArr(String[] array)
	{
		for (int i = 0; i < array.length; i++)
			array[i] = next();

		return array;
	}

	public Collection<String> fillColl(Collection<String> col, int times)
	{
		for (int i = 0; i < times; i++)
			col.add(next());

		return col;
	}

	public static void main(String[] Args)
	{
		Ex4 e = new Ex4();
		String[] stringArr = new String[8];
		Collection<String> stringList = new ArrayList<String>();
		Collection<String> stringLinked = new LinkedList<String>();
		Collection<String> setHash = new HashSet<String>();
		Collection<String> setLink = new LinkedHashSet<String>();
		Collection<String> setTree = new TreeSet<String>();

		e.fillArr(stringArr);

		for (String s : stringArr)
			System.out.print(s + " ");
		System.out.println("");
		System.out.println(e.fillColl(stringList, 10));
		System.out.println(e.fillColl(stringLinked, 10));
		System.out.println(e.fillColl(setHash, 10));
		System.out.println(e.fillColl(setLink, 10));
		System.out.println(e.fillColl(setTree, 10));
	}
}
