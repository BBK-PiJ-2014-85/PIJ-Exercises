package e8;

public class ClusteredQueue implements PersonQueue{

	Person firstPerson;

	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		
		//if its 65 or more, then do until next<65 or null
		//if its more than 18, then do until next<18 or null
	//else put at end
	int ageCutoff = getAgeCutoff(person.getAge());
	
	if (firstPerson == null) firstPerson=person;
	else if (firstPerson.getAge() < ageCutoff)
	{
		person.setNextPerson(firstPerson);
		firstPerson = person;
	}
	else
	{
		Person currentPerson = firstPerson;

		while ( (currentPerson.getNextPerson() != null) && (currentPerson.getNextPerson().getAge() >= ageCutoff) )
		{
			currentPerson = currentPerson.getNextPerson();
		}
		
		person.setNextPerson(currentPerson.getNextPerson());
		currentPerson.setNextPerson(person);
	}
	
	}
	
	@Override
	public Person retrieve() {
		// TODO Auto-generated method stub
		if (firstPerson == null) return null;
		Person temp = firstPerson;
		firstPerson = firstPerson.getNextPerson();
		return temp;
	}
	
	
	
	private int getAgeCutoff(int age)
	{
		if (age > 65) return 65;
		else if (age > 18) return 18;
		else return 0;
	}
	
}
