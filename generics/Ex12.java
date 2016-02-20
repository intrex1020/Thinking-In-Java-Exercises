package generics;

import java.util.List;
import java.util.Map;
import Pets.Person;
import Pets.Pet;
import net.mindview.util.New;

public class Ex12
{
	static void f(Map<Person, List<? extends Pet>> petPeople)
	{
	}

	public void main(String[] Args)
	{
		Ex12.f(New.<Person, List<? extends Pet>> map());
	}
}