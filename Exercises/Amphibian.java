package Exercises;

public class Amphibian extends Frog
{
	@Override
	public void kum()
	{
	}

	public void jump(Frog f)
	{
		f.kum();
	}

	public static void main(String[] args)
	{
		Amphibian a = new Amphibian();
		Frog.jump(a);
	}
}

class Frog
{
	public void kum()
	{
	}

	public static void jump(Frog f)
	{
		f.kum();
	}
}
