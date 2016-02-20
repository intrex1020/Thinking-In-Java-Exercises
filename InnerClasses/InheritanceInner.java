package InnerClasses;

public class InheritanceInner
{
	class SecondInner extends FirstOuter.FirstInner
	{
		public SecondInner(FirstOuter o)
		{
			o.super("String");
			System.out.println("Hi inner");
		}
	}

	public static void main(String[] Args)
	{
		FirstOuter o = new FirstOuter();
		InheritanceInner i = new InheritanceInner();
		i.new SecondInner(o);
	}
}

class FirstOuter
{
	class FirstInner
	{
		FirstInner(String s)
		{
			System.out.println("Hi" + s);
		}
	}
}
