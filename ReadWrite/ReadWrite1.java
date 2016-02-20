package ReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWrite1
{
	String s;
	List<String> stringList = new ArrayList<String>();

	public void readFile()
	{
		try
		{
			String source = "path";
			Scanner readFile = new Scanner(new FileReader(source));

			while (readFile.hasNext())
			{
				readFile.useDelimiter(";");
				stringList.add(readFile.next());
			}
			System.out.println(stringList);
			readFile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("asd");
		}
	}

	public synchronized File getMyFile() throws Exception
	{
		File file = new File("path");
		if (!file.exists())
		{
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		return file;
	}

	public void saveFile()
	{
		try
		{
			PrintWriter save = new PrintWriter("path");

			getMyFile();
			save.println(stringList.toString());
			save.close();
		}
		catch (Exception e)
		{
			System.out.println("asdd");
		}
	}

	public static void main(String[] Args)
	{
		ReadWrite1 start = new ReadWrite1();
		start.readFile();
		start.saveFile();
	}
}
