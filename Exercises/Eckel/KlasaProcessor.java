package Exercises.Eckel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Klasa extends KlasaProcessor
{
	List<String> lista = new ArrayList<String>();

	public String name()
	{
		return getClass().getSimpleName();
	}

	public String process(Object input)
	{
		String s = (String) input;

		for (int i = 0; i < s.length(); i++)
			if ((i % 2) == 1)
			{
				String ss = s.substring(i - 1, i + 1);
				lista.add(ss);
			}
		for (int i = 0; i < (lista.size() - 1); i++)
			Collections.swap(lista, i, i + 1);
		Object o = lista;
		System.out.println("");
		return o.toString();
	}
}

public abstract class KlasaProcessor
{
	public static void main(String[] Args)
	{
		String word = "arbu";
		Apply.process(new KlasaAdapter(new Klasa()), word);
	}
}

class KlasaAdapter implements Processor
{
	Klasa klasa;

	public KlasaAdapter(Klasa klasa)
	{
		this.klasa = klasa;
	}

	@Override
	public String name()
	{
		return klasa.name();
	}

	@Override
	public String process(Object input)
	{
		return klasa.process(input);
	}
}