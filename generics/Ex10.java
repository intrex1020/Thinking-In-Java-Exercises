package generics;

public class Ex10
{
	public <T, U> void f(T x, U y, Integer h)
	{
		System.out.printf("%s\n%s\n%s\n", x.getClass().getSimpleName(), y.getClass().getSimpleName(),
				h.getClass().getSimpleName());
	}

	public static void main(String[] Args)
	{
		Ex10 e = new Ex10();

		e.f("Hi", 1, 2);
		e.f(e, 2.5, 1);
	}
}
