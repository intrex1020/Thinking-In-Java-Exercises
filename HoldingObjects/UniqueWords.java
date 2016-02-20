package HoldingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.mindview.util.TextFile;

public class UniqueWords
{
	public static void main(String[] args)
	{
		List<String> words = new ArrayList<String>();
		words.addAll(new TextFile("C:\\Users\\Intrex\\Desktop\\New folder (2)\\holding\\SetOperations.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		Map<Character, Integer> vowels = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> vowels2 = new LinkedHashMap<Character, Integer>();
		Map<String, Integer> wordz = new LinkedHashMap<String, Integer>();
		vowels.put('A', 0);
		vowels.put('E', 0);
		vowels.put('I', 0);
		vowels.put('O', 0);
		vowels.put('U', 0);
		vowels.put('a', 0);
		vowels.put('e', 0);
		vowels.put('i', 0);
		vowels.put('o', 0);
		vowels.put('u', 0);
		vowels2.put('a', 0);
		vowels2.put('e', 0);
		vowels2.put('i', 0);
		vowels2.put('o', 0);
		vowels2.put('u', 0);

		System.out.println(words);
		for (String s : words)
		{
			for (char c : s.toCharArray())
			{
				if (vowels.containsKey(c))
					vowels.put(c, (vowels.get(c) + 1));
				if (vowels2.containsKey(Character.toLowerCase(c)))
					vowels2.put(Character.toLowerCase(c), (vowels2.get(Character.toLowerCase(c)) + 1));
			}
			if (wordz.containsKey(s))
				wordz.put(s, (wordz.get(s) + 1));
			else
				wordz.put(s, 1);
		}
		System.out.println(vowels);
		System.out.println(vowels2);
		System.out.println(wordz);
	}
} /*
	 * Output: [A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N,
	 * Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added,
	 * args, class, contains, containsAll, false, from, holding, import, in,
	 * java, main, mindview, net, new, print, public, remove, removeAll,
	 * removed, set1, set2, split, static, to, true, util, void]
	 */// :~
