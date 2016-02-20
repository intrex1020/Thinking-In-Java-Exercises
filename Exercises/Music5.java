package Exercises;

interface Playable
{
	void play(Note n);
}

interface Instrument
{
	int VALUE = 5;

	void adjust();
}

enum Note
{
	MIDDLE_C;
}

abstract class DefaultInstrument implements Instrument, Playable
{
	@Override
	public void play(Note n)
	{
		System.out.println(this + ".play() " + n);
	}

	@Override
	public void adjust()
	{
		System.out.println(this + "adjust()");
	}
}

class Wind extends DefaultInstrument
{
	@Override
	public String toString()
	{
		return "Wind";
	}
}

class Percussion extends DefaultInstrument
{
	@Override
	public String toString()
	{
		return "Percussion";
	}
}

class Stringed extends DefaultInstrument
{
	@Override
	public String toString()
	{
		return "Stringed";
	}
}

class Brass extends Wind
{
	@Override
	public String toString()
	{
		return "Brass";
	}
}

class Woodwind extends Wind
{
	@Override
	public String toString()
	{
		return "Woodwind";
	}
}

public class Music5
{

	public static void tune(Playable p)
	{
		p.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e)
	{
		for (Instrument i : e)
			Music5.tune(i);
	}

	public static void main(String[] Args)
	{
		Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
		Music5.tuneAll(orchestra);
	}
}
