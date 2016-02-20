package HoldingObjects;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Stack
{
	public static void main(String[] Args)
	{
		Deque<Character> stack = new ArrayDeque<Character>();
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		List<Character> list = new LinkedList<Character>();

		for (char c : s.toCharArray())
			list.add(c);
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) == '+')
				stack.push(list.get(i + 1));
			if (list.get(i) == '-')
				System.out.print(stack.pop());
		}
	}
}
