package e8;

public class SupermarketPersonQueue implements PersonQueue{

	Person firstPerson;
	
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		
		if (firstPerson == null) firstPerson = person;
		else
		{
			Person currentPerson = firstPerson;
			while (currentPerson.getNextPerson() != null)
			{
				currentPerson = currentPerson.getNextPerson();
			}
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

}
