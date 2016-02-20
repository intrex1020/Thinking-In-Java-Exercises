package InnerClasses;

interface Contents
{
	int value();
}

interface Destination
{
	String readLabel();
}

class Parcel4
{
	private class PContents implements Contents
	{
		private int i = 11;

		@Override
		public int value()
		{
			return i;
		}
	}

	protected class PDestination implements Destination
	{
		private String label;

		private PDestination(String whereTo)
		{
			label = whereTo;
		}

		@Override
		public String readLabel()
		{
			return label;
		}
	}

	public Destination destination(String s)
	{
		return new PDestination(s);
	}

	public Contents contents()
	{
		return new PContents();
	}
}

public class TestParcel
{
	public static void main(String[] args)
	{
		Parcel4 p = new Parcel4();
		p.contents();
		p.destination("Tasmania");
	}
} /// :~
