package Exceptions;

class Shape
{
	Shape(int i)
	{
		System.out.print("Shape constructor");
	}

	void dispose()
	{
		System.out.print("Shape dispose");
	}
}

class Circle extends Shape
{
	Circle(int i)
	{
		super(i);
		System.out.print("Drawing Circle");
	}

	@Override
	void dispose()
	{
		System.out.print("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape
{
	Triangle(int i)
	{
		super(i);
		System.out.print("Drawing Triangle");
	}

	@Override
	void dispose()
	{
		System.out.print("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape
{
	private int start, end;

	Line(int start, int end)
	{
		super(start);
		this.start = start;
		this.end = end;
		System.out.print("Drawing Line: " + start + ", " + end);
	}

	@Override
	void dispose()
	{
		System.out.print("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem extends Shape
{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];

	public CADSystem(int i)
	{
		super(i + 1);
		for (int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j * j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.print("Combined constructor");
	}

	@Override
	public void dispose()
	{
		System.out.print("CADSystem.dispose()");
		// The order of cleanup is the reverse
		// of the order of initialization:
		t.dispose();
		c.dispose();
		for (int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}

	public static void main(String[] args)
	{
		CADSystem x = new CADSystem(47);
		try
		{
			return;
		}
		finally
		{
			x.dispose();
		}
	}
} /*
	 * Output: Shape constructor Shape constructor Drawing Line: 0, 0 Shape
	 * constructor Drawing Line: 1, 1 Shape constructor Drawing Line: 2, 4 Shape
	 * constructor Drawing Circle Shape constructor Drawing Triangle Combined
	 * constructor CADSystem.dispose() Erasing Triangle Shape dispose Erasing
	 * Circle Shape dispose Erasing Line: 2, 4 Shape dispose Erasing Line: 1, 1
	 * Shape dispose Erasing Line: 0, 0 Shape dispose Shape dispose
	 */// :~
