package HoldingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import Pets.Cymric;
import Pets.Pet;

public class ListFeatures
{
	public static void main(String[] args)
	{
		Random rand = new Random(47);
		List<Integer> intArr = new ArrayList<Integer>();
		Collections.addAll(intArr, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> ints = intArr;
		System.out.println("1: " + ints);
		Integer intt = new Integer(5);
		ints.add(intt); // Automatically resizes
		System.out.println("2: " + ints);
		System.out.println("3: " + ints.contains(intt));
		ints.remove(intt); // Remove by object
		Integer p = ints.get(2);
		System.out.println("4: " + p + " " + ints.indexOf(p));
		Pet cymric = new Cymric();
		System.out.println("5: " + ints.indexOf(cymric));
		System.out.println("6: " + ints.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + ints.remove(p));
		System.out.println("8: " + ints);
		ints.add(3, new Integer(12)); // Insert at an index
		System.out.println("9: " + ints);
		List<Integer> sub = ints.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + ints.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(ints); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, new Integer(50)); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + ints.isEmpty());
		ints.clear(); // Remove all elements
		System.out.println("19: " + ints);
		System.out.println("20: " + ints.isEmpty());
		ints.addAll(ListFeatures.listOfRandInteger(4, 10));
		System.out.println("21: " + ints);
		Object[] o = ints.toArray();
		System.out.println("22: " + o[3]);
		Integer[] pa = ints.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);
	}

	// method to make a List<Integer> with random values < n:
	public static List<Integer> listOfRandInteger(int length, int n)
	{
		Random rand = new Random();
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < length; i++)
			li.add(rand.nextInt(n));
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
