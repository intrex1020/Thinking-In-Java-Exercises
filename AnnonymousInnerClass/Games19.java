package AnnonymousInnerClass;

import java.util.Random;

interface Games
{
	void play();
}

interface GamesFactory
{
	Games getGames();
}

class CoinToss implements Games
{
	Random rand = new Random();

	public static GamesFactory factory = new GamesFactory()
	{
		@Override
		public Games getGames()
		{
			return new CoinToss();
		}
	};

	@Override
	public void play()
	{
		System.out.print("Toss Coin: ");
		switch (rand.nextInt(2))
		{
			case 0:
				System.out.println("Heads");
				return;
			case 1:
				System.out.println("Tails");
				return;
			default:
				System.out.println("OnEdge");
				return;
		}
	}
}

class DiceThrow implements Games
{
	Random rand = new Random();

	public static GamesFactory factory = new GamesFactory()
	{
		@Override
		public Games getGames()
		{
			return new DiceThrow();
		}
	};

	@Override
	public void play()
	{
		System.out.print("Throw Dice: " + (rand.nextInt(6) + 1));
	}
}

public class Games19
{
	public static void playGame(GamesFactory factory)
	{
		Games g = factory.getGames();
		g.play();
	}

	public static void main(String[] args)
	{
		Games19.playGame(CoinToss.factory);
		Games19.playGame(DiceThrow.factory);
	}
}