package Exercises.Eckel;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class CharSeq extends chaars implements Readable
{
	private int count;

	public CharSeq(int count)
	{
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb)
	{
		if (count-- == 0)
			return -1;
		cb.append(next());
		return 10;
	}

	public static void main(String[] Args)
	{
		Scanner s = new Scanner(new CharSeq(3));
		while (s.hasNextLine())
			System.out.println(s.nextLine());
		s.close();
	}
}

class chaars
{
	private Random rand = new Random(100);
	private char[] cap = "ABCDEFGHIJKLMNOPRSTUWVYXabcdefghijklmnoprstuwvyx".toCharArray();

	public char next()
	{
		return cap[rand.nextInt(47)];
	}
}
