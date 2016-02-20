package Exercises;

/*
 * Some interfaces may be set for default properties throught abstrac class, if those are not
 * interface methods must be used in extended classes of abstract class
 */

interface Turkey
{
	void makeGobbleGobble();

	int getFeatherCount();

	void layBigEgg();

	void takeASiesta();
}

// You can't use "new" on this class. It's missing some methods.
abstract class DefaultTurkey implements Turkey
{
	@Override
	public void layBigEgg()
	{
		// HappyTurkeyFarm.addBigEgg();
	}

	@Override
	public void takeASiesta()
	{
		System.out.println("I'm taking a nap, because I'm a tired turkey.");
	}
}

class HappyTurkey extends DefaultTurkey
{
	@Override
	public void makeGobbleGobble()
	{
		System.out.println("OMG, what was in that brownie! Gobble gobble gobble! :D");
	}

	@Override
	public int getFeatherCount()
	{
		return 1;
	}

	// Can override abstract class methods
	@Override
	public void layBigEgg()
	{
		super.layBigEgg();
	}

	// Method is not abstrac, can override and change return value
	public int layBigEgg(int i)
	{
		return 1;
	}

	// public int getFeatherCount(400000);
}

class SadTurkey extends DefaultTurkey
{
	@Override
	public void makeGobbleGobble()
	{
		System.out.println("Bad trip man. Gobble gobble gobble :(");
	}

	@Override
	public int getFeatherCount()
	{
		return 1;
	}

	// public int getFeatherCount(2);
}

public class Interface
{
	public static void asd(Turkey t)
	{
		t.layBigEgg();
		t.takeASiesta();
		System.out.println(t.getFeatherCount());
	}

	public static void main(String[] Args)
	{
		Turkey t1 = new HappyTurkey();
		Turkey t2 = new SadTurkey();
		DefaultTurkey t3 = new HappyTurkey();
		Interface.asd(t1);
		Interface.asd(t2);
		Interface.asd(t3);
	}
}
