package ReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class ReadWrite2
{
	private JFileChooser choose = new JFileChooser();
	private List<String> list = new ArrayList<String>();

	public File openFile() throws Exception
	{
		File source = null;
		choose.setFileSelectionMode(0);
		if (choose.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
			System.exit(0);
		source = choose.getSelectedFile();
		existance(source);
		return source;
	}

	public void saveFormating() throws Exception
	{
		File output = null;

		if (choose.showSaveDialog(null) != JFileChooser.APPROVE_OPTION)
			System.exit(0);
		output = choose.getSelectedFile();
		existance(output);
		PrintWriter save = new PrintWriter(output);
		for (String s : list)
			save.print(s + ";");
		save.close();
	}

	public void deleteFile() throws Exception
	{
		File delete = null;

		if (choose.showDialog(null, "Delete") != JFileChooser.APPROVE_OPTION)
			System.exit(0);
		delete = choose.getSelectedFile();
		existance(delete);
		delete.delete();
	}

	public void fomratFile(File file) throws Exception
	{
		Scanner read = new Scanner(file);

		read.useDelimiter(";");
		while (read.hasNext())
		{
			String s = read.next();
			System.out.println(s);
			char[] array = s.toCharArray();
			for (int i = 0; i < array.length; i++)
				if (array[i] == 'a')
					array[i] = '5';
			list.add(String.copyValueOf(array));
		}
		read.close();
	}

	private void existance(File file) throws Exception
	{
		if (!file.exists() && !file.isFile())
			throw new FileNotFoundException();
	}

	public static void main(String[] Args)
	{
		ReadWrite2 start = new ReadWrite2();
		try
		{
			start.fomratFile(start.openFile());
			start.saveFormating();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
