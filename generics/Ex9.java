package generics;

public class Ex9
{
	public <T, U, V> void f(T x, U y, V h)
	{
		System.out.printf("%s\n%s\n%s\n", x.getClass().getSimpleName(), y.getClass().getSimpleName(),
				h.getClass().getSimpleName());
	}

	public static void main(String[] Args)
	{
		Ex9 e = new Ex9();

		e.f("Hi", 1, 2.5f);
		e.f(e, 2.5, true);
	}
}
