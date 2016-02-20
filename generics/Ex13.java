package generics;

import java.util.*;
import net.mindview.util.*;
import coffee.*;

public class Ex13
{
	public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n)
	{
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}
	
	public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n)
	{
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}
	
	public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n)
	{
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}
	
	public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n)
	{
		System.out.println("here");
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static void main(String[] args)
	{
		//It goes to LinkedList method not List, it is possible to distinguish difference
		List<Coffee> coffee = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 4);
		for (Coffee c : coffee)
			System.out.println(c);
		List<Integer> fnumbers = fill(new ArrayList<Integer>(), new Fibonacci(), 12);
		for (int i : fnumbers)
			System.out.print(i + ", ");
	}
}
