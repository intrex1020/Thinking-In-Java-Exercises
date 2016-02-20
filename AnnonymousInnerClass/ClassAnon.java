package AnnonymousInnerClass;

public class ClassAnon
{
	private String s;

	public ClassAnon(String s)
	{
		this.s = s;
	}

	public void showS()
	{
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		AnnonClassz a = new AnnonClassz();
		a.anonRef("hi").showS();
	}

}

class AnnonClassz
{
	public ClassAnon anonRef(String s)
	{
		return new ClassAnon(s)
		{

		};
	}
}
