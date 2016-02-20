package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutorial3
{
	public static void main(String[] Args)
	{
		Person p = new Person("0", "0");
		Person p2 = new Person("2", "2");
		Parent p1 = new Parent("1", "1", Arrays.asList(p, p2));
		System.out.println(p1.getChildren());
		System.out.print(p);
	}
}

class Person
{
	private String name;
	private String surname;

	public Person(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}

	/**
	 * @return the surname
	 */
	public String getSurname()
	{
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name + " " + surname;
	}
}

class Student extends Person
{
	private String studentID;
	private int stage;

	public Student(String name, String surname, String studentID, int stage)
	{
		super(name, surname);
		this.studentID = studentID;
		this.stage = stage;
	}

	/**
	 * @return the studentID
	 */
	public String getStudentID()
	{
		return studentID;
	}

	/**
	 * @return the stage
	 */
	public int getStage()
	{
		return stage;
	}

	@Override
	public String toString()
	{
		return super.getName() + " " + super.getSurname() + " " + studentID + " " + stage;
	}
}

class Parent extends Person
{
	List<Person> children = new ArrayList<Person>();

	public Parent(String name, String surname, List<Person> children)
	{
		super(name, surname);
		this.children = children;
	}

	public List<Person> getChildren()
	{
		return children;
	}
}