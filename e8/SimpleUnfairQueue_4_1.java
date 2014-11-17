package e8;

public class SimpleUnfairQueue_4_1 implements PersonQueue {

	private Person firstPerson;
	
	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		if (firstPerson == null) firstPerson = person;
		else
		{
			int newAge = person.getAge();
			
			Person currentPerson = firstPerson;
			
			if (firstPerson.getAge() < newAge)
			{
				Person temp = firstPerson;
				firstPerson = person;
				firstPerson.setNextPerson(temp);
			}
			else
			{
				currentPerson = firstPerson;
				while (currentPerson.getNextPerson() != null || currentPerson.getNextPerson().getAge() > newAge)
				{
					currentPerson = currentPerson.getNextPerson();
				}
				
				if (currentPerson.getNextPerson() == null) currentPerson.setNextPerson(person);
				else
				{
					Person temp = currentPerson.getNextPerson();
					currentPerson.setNextPerson(person);
					person.setNextPerson(temp);
				}
				
			}

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
