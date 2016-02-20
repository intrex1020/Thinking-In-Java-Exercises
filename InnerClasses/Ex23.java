package InnerClasses;

interface U
{
	void method1();

	void method2();

	@Override
	String toString();
}

class A
{
	public U exRef()
	{
		return new U()
		{
			@Override
			public void method1()
			{
				System.out.println("Hi");
			}

			@Override
			public void method2()
			{
				System.out.println("Hai");
			}

			@Override
			public String toString()
			{
				return "U";
			}
		};
	}
}

class B
{
	U[] array;
	private int i = 0;

	public B(int i)
	{
		array = new U[i];
	}

	public void refToEx(U ex)
	{
		array[i] = ex;
		i++;
	}

	public void delRef(int j)
	{
		array[j] = null;
	}

	public void callEx()
	{
		for (U e : array)
		{
			e.method1();
			e.method2();
			e.toString();
		}
	}

	public void exNull()
	{
		for (U e : array)
			if (e != null)
				System.out.println(e.toString());
			else
				System.out.println("Null");
	}
}

public class Ex23
{
	public static void main(String[] Args)
	{
		A a = new A();
		A a1 = new A();
		A a2 = new A();
		B b = new B(3);
		b.refToEx(a.exRef());
		b.refToEx(a1.exRef());
		b.refToEx(a2.exRef());
		b.delRef(2);
		b.exNull();
	}
}
