package Exercises.Eckel;

public class Waveform
{
	private static long counter;
	private final long id = Waveform.counter++;

	@Override
	public String toString()
	{
		return "Waveform " + id;
	}
} /// :~
