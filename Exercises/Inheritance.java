package Exercises;

public class Inheritance
{
	public static void test(Car1 c)
	{
		c.driveForward();
		c.turnLeft();
		c.turnRight();
		c.driveBack();
		c.gear(1);
	}

	public static void main(String[] Args)
	{
		// Car a = new Car(); //Does not work on abstract class
		Car1 b = new Ferrari();
		Ferrari c = new Ferrari();
		Car1 d = c;
		Ferrari e = (Ferrari) d;
		// test(a);
		Inheritance.test(b); // Upcast
		Inheritance.test(c);
		Inheritance.test(e); // Downcast
	}
}

/*
 * Does not ensure origin's class methods in derived class or calls to them(if
 * they are abstract it does) Default implementations
 */

abstract class Car1
{
	public void driveForward()
	{
		System.out.println("Im driving str8");
	}

	public void turnLeft()
	{
		System.out.println("Turns right");
	}

	public void turnRight()
	{
		System.out.println("Turns left");
	}

	public void driveBack()
	{
		System.out.println("Reverse\n");
	}

	public abstract void gear(int i);
}

class Ferrari extends Car1
{
	// Must return same type and take same type/amount of parameters
	@Override
	public void gear(int i)
	{
		System.out.println("New Gear " + i);
	}
}

/*
 * Ensure all core methods are in derived class,
 * "You know its a Turkey and you can use it as a turkey"
 */

interface Turkey1
{
	void getFetherCount();

	void makeGobbleGobble();
}

class HappyTurkey1 implements Turkey1
{
	// Must return same type and take same type/amount of parameters
	@Override
	public void getFetherCount()
	{

	}

	@Override
	public void makeGobbleGobble()
	{

	}

	public void asd()
	{

	}
}
