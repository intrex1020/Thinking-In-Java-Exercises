package generics;

import net.mindview.util.*;
import static net.mindview.util.Tuple.*;

public class TupleTest2
{
	static TwoTuple<String, Integer> f()
	{
		return tuple("hi", 47);
	}

	static TwoTuple f2()
	{
		return tuple("hi", 47);
	}
	
	static SixTuple<String, Integer, Boolean, Float, Double, Character> f61()
	{
		return tuple("hi", 47, true, 2.5f, 5.5, 'c');
	}
	
	static SixTuple f62()
	{
		return tuple("hi", 47, true, 2.5f, 5.5, 'c');
	}

	public static void main(String[] args)
	{
		TwoTuple<String, Integer> ttsi = f();
		TwoTuple<String, Integer> Ex15 = f2(); // Warning unchecked conversion
		System.out.println(ttsi);
		System.out.println(f2());
		System.out.println(Ex15);
		System.out.println(f61());
		System.out.println(f62());
	}
} 