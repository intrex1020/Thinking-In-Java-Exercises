package Exercises.Eckel;

public class ClassIf
{
	private void track(boolean b)
	{
		if (b)
		{
			class TrackingSlip
			{
				private String id;

				TrackingSlip(String s)
				{
					id = s;
				}

				String getSlip()
				{
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			ts.getSlip();
		}
	}

	public void newTrack()
	{
		track(true);
	}

	public static void main(String[] Args)
	{
		ClassIf i = new ClassIf();
		i.newTrack();
	}
}
