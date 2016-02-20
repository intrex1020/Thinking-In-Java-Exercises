package HoldingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import Pets.Cymric;
import Pets.Pet;

public class ListFeaturesStrings
{
	public static void main(String[] args)
	{
		Random rand = new Random(47);
		List<String> stringArr = new ArrayList<String>();
		Collections.addAll(stringArr, "zero", "jeden", "dwa", "trzy", "cztery", "piec", "szesc", "siedem", "osiem",
				"dziewiec");

		List<String> strings = stringArr;
		System.out.println("1: " + strings);
		String intt = new String("dzziesiec");
		strings.add(intt); // Automatically resizes
		System.out.println("2: " + strings);
		System.out.println("3: " + strings.contains(intt));
		strings.remove(intt); // Remove by object
		String p = strings.get(2);
		System.out.println("4: " + p + " " + strings.indexOf(p));
		Pet cymric = new Cymric();
		System.out.println("5: " + strings.indexOf(cymric));
		System.out.println("6: " + strings.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + strings.remove(p));
		System.out.println("8: " + strings);
		strings.add(3, new String("jedynascie")); // Insert at an index
		System.out.println("9: " + strings);
		List<String> sub = strings.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + strings.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + strings.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + strings.containsAll(sub));
		List<String> copy = new ArrayList<String>(strings);
		sub = Arrays.asList(strings.get(1), strings.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(strings); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, new String("dwanascie")); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + strings.isEmpty());
		strings.clear(); // Remove all elements
		System.out.println("19: " + strings);
		System.out.println("20: " + strings.isEmpty());
		strings.addAll(ListFeaturesStrings.listOfRandString());
		System.out.println("21: " + strings);
		Object[] o = strings.toArray();
		System.out.println("22: " + o[3]);
		String[] pa = strings.toArray(new String[0]);
		System.out.println("23: " + pa[3]);
	}

	// method to make a List<String> with random values < n:
	public static List<String> listOfRandString()
	{
		List<String> li = new ArrayList<String>();
		Collections.addAll(li, "dwiescie", "czysta", "czterysta", "pincset");
		return li;
	}
} /*
	 * Output: 1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug] 2: [Rat, Manx,
	 * Cymric, Mutt, Pug, Cymric, Pug, Hamster] 3: true 4: Cymric 2 5: -1 6:
	 * false 7: true 8: [Rat, Manx, Mutt, Pug, Cymric, Pug] 9: [Rat, Manx, Mutt,
	 * Mouse, Pug, Cymric, Pug] subList: [Manx, Mutt, Mouse] 10: true sorted
	 * subList: [Manx, Mouse, Mutt] 11: true shuffled subList: [Mouse, Manx,
	 * Mutt] 12: true sub: [Mouse, Pug] 13: [Mouse, Pug] 14: [Rat, Mouse, Mutt,
	 * Pug, Cymric, Pug] 15: [Rat, Mutt, Cymric, Pug] 16: [Rat, Mouse, Cymric,
	 * Pug] 17: [Rat, Mouse, Mouse, Pug, Cymric, Pug] 18: false 19: [] 20: true
	 * 21: [Manx, Cymric, Rat, EgyptianMau] 22: EgyptianMau 23: 14
	 */// :~
