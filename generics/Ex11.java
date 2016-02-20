package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import net.mindview.util.New;

public class Ex11
{
	public static void main(String[] Args)
	{
		A a = new A();
		new B();
		new C();
		List<C> lc = New.list();
		lc.add(new C());
		Map<A, List<? extends B>> mab = New.map();
		mab.put(a, lc);
		LinkedList<B> llb = New.lList();
		llb.add(new B());
		Set<A> sa = New.set();
		sa.add(new A());
		Queue<B> qb = New.queue();
		qb.add(new B());
		System.out.println(lc);
		System.out.println(mab);
		System.out.println(llb);
		System.out.println(sa);
		System.out.println(qb);
	}
}

class A
{
}

class B extends A
{
}

class C extends B
{
}
