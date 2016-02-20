package HoldingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.mindview.util.TextFile;

public class Ex22
{
	public static void main(String[] Args)
	{
		List<String> words = new ArrayList<String>();
		words.addAll(new TextFile("C:\\Users\\Intrex\\Desktop\\New folder (2)\\holding\\SetOperations.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		Set<Word> set = new LinkedHashSet<Word>();

		Iterator<String> it = words.listIterator();

		while (it.hasNext())
		{
			String s = it.next();
			int count = 0;
			for (int i = 0; i < words.size(); i++)
				if (s.equals(words.get(i)))
					count++;
			set.add(new Word(s, count));
		}
		System.out.println(set);
		System.out.println(Word.allWorlds);
	}
}

class Word
{
	private String s;
	private int count;
	static int allWorlds = 0;

	public Word(String s, int count)
	{
		this.s = s;
		this.count = count;
		Word.allWorlds++;
	}

	@Override
	public String toString()
	{
		return s + " " + count;
	}
}