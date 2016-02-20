package Exercises.Eckel;

interface IntexInt
{
	void metoda1();
}

interface IntExInt1
{
	void metoda2();
}

interface IntExInt2 extends IntexInt, IntExInt1
{
	void metoda3();
}

class IntKlasa extends IntKlasa2 implements IntExInt2
{
	@Override
	public void metoda1()
	{
	}

	@Override
	public void metoda2()
	{
	}

	@Override
	public void metoda3()
	{
	}

	public void metoda4()
	{
	}
}

abstract class IntKlasa2
{
	public void metoda5()
	{
	}
}

class IntKlasa1 extends IntKlasa
{
	static void method1(IntexInt x)
	{
	};

	static void method2(IntExInt1 x)
	{
	};

	static void method3(IntExInt2 x)
	{
	};

	static void method4(IntKlasa x)
	{
	};

	public static void main(String[] Args)
	{
		IntKlasa k = new IntKlasa1();
		IntKlasa1.method1(k);
		IntKlasa1.method2(k);
		IntKlasa1.method3(k);
		IntKlasa1.method4(k);
	}
}
