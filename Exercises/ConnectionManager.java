package Exercises;

public class ConnectionManager
{
	public static void main(String[] Args)
	{
		Connect.connection();
		Connect.connection();
		Connect.connection();
		Connect.connection();
		Connect.connection();
	}
}

class Connect
{
	private static Connect[] connect = {new Connect(), new Connect(), new Connect()};
	private static int connection = 0;

	private Connect()
	{
		System.out.println("Connected");
	}

	public static Connect connection()
	{
		if (Connect.connection < Connect.connect.length)
			return Connect.connect[Connect.connection++];
		else
		{
			System.out.println("Error");
			return null;
		}
	}
}
