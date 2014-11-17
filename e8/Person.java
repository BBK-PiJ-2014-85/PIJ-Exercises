package e8;

public class Person {

	private String name;
	private int age;
	private Person nextPerson;
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public Person getNextPerson() {return nextPerson;}
	
	public void setNextPerson(Person person) {nextPerson = person;}
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
}
