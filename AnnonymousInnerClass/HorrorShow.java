package AnnonymousInnerClass;

interface Monster
{
	void menace();
}

interface DangerousMonster extends Monster
{
	void destroy();
}

interface Lethal
{
	void kill();
}

class DragonZilla implements DangerousMonster
{
	@Override
	public void menace()
	{
	}

	@Override
	public void destroy()
	{
	}
}

interface Vampire extends DangerousMonster, Lethal
{
	void drinkBlood();
}

class VeryBadVampire implements Vampire
{
	@Override
	public void menace()
	{
	}

	@Override
	public void destroy()
	{
	}

	@Override
	public void kill()
	{
	}

	@Override
	public void drinkBlood()
	{
	}
}

public class HorrorShow
{
	static void u(Monster b)
	{
		b.menace();
	}

	static void v(DangerousMonster d)
	{
		d.menace();
		d.destroy();
	}

	static void w(Lethal l)
	{
		l.kill();
	}

	public DangerousMonster dangMonst()
	{
		return new DangerousMonster()
		{
			@Override
			public void menace()
			{
			}

			@Override
			public void destroy()
			{
			}
		};
	}

	public Vampire vampire()
	{
		return new Vampire()
		{
			@Override
			public void menace()
			{
			}

			@Override
			public void destroy()
			{
			}

			@Override
			public void kill()
			{
			}

			@Override
			public void drinkBlood()
			{
			}
		};
	}

	public static void main(String[] args)
	{
		DangerousMonster barney = new DragonZilla();
		HorrorShow.u(barney);
		HorrorShow.v(barney);
		Vampire vlad = new VeryBadVampire();
		HorrorShow.u(vlad);
		HorrorShow.v(vlad);
		HorrorShow.w(vlad);
		HorrorShow h = new HorrorShow();
		HorrorShow.u(h.dangMonst());
		HorrorShow.v(h.dangMonst());
		HorrorShow.u(h.vampire());
		HorrorShow.v(h.vampire());
		HorrorShow.w(h.vampire());

	}
} /// :~
