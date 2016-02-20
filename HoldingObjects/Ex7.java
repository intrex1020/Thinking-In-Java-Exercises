package HoldingObjects;

import java.util.ArrayList;
import java.util.List;

class Test
{
	@Override
	public String toString()
	{
		return "haro";
	}
}

public class Ex7
{
	public static void main(String[] Args)
	{
		Test[] tab = new Test[10];
		for (int i = 0; i < tab.length; i++)
			tab[i] = new Test();
		List<Test> list = new ArrayList<Test>();
		for (Test e : tab)
			list.add(e);
		System.out.println(list);
		List<Test> sub = list.subList(2, 5);
		System.out.println("Sub " + sub);
		list.removeAll(sub);
		System.out.println(list);
	}
}
