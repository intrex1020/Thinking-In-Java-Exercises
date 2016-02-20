package Exercises.Eckel;

public class ClassCeption
{
	class InnerClass
	{

	}

	public InnerClass innerRef()
	{
		return new InnerClass();
	}
}

class RefClass
{
	ClassCeption c = new ClassCeption();
	ClassCeption.InnerClass d = c.new InnerClass();
	ClassCeption.InnerClass e = c.innerRef();
}
