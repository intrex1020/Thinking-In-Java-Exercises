package Exceptions;

public class FailingConstructor
{
	private Ex23 e;
	private Ex23 ee;

	public FailingConstructor() throws Exception
	{
		try
		{
			e = new Ex23("e");
			try
			{
				e.msg();
				ee = new Ex23("ee");
				ee.fail(); // fail in middle of construction
				try
				{
					ee.msg();
				}
				finally
				{
					ee.dispose();
				}
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage());
				throw ex;
			}
			finally
			{
				e.dispose();
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			throw ex;
		}
	}

	public void dispose()
	{
		System.out.println("Disposing FailConstClass");
	}

	public void doSomething()
	{
		System.out.println("Did something");
	}

	public static void main(String[] Args)
	{
		try
		{
			FailingConstructor f = new FailingConstructor();
			try
			{
				f.doSomething(); // No need catch coz cant fail
			}
			finally
			{
				f.dispose();
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception during creating f");
		}
	}
}

class Ex23
{
	String s;

	public Ex23(String s)
	{
		this.s = s;
	}

	public void dispose()
	{
		System.out.println("Disposed " + s);
	}

	public void msg()
	{
		System.out.println("msg " + s);
	}

	public void fail() throws Exception
	{
		throw new Exception("fail " + s);
	}
}
