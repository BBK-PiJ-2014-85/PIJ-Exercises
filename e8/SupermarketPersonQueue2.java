package e8;

public class SupermarketPersonQueue2 implements PersonQueue{
	
	// This implementation uses arrays whereas the previous one (SupermarketPersonQueue) used pointers
	
	int numPeople = 0;
	Person[] people = new Person[4];

	
	@Override
	public void insert(Person person) {
		
		if (numPeople == people.length)
		{
			Person[] newList = new Person[numPeople * 2];
			
			for (int i = 0; i< numPeople; i++)
			{
				newList[i] = people[i];
			}
			
			people = newList;
		}
		
		people[numPeople] = person;
		numPeople++;
		
	}

	@Override
	public Person retrieve() {
		
		Person rtnPerson = people[0];

		for (int i =0; i <= numPeople; i++)
		{
			if (i < numPeople) people[i] = people[i+1];
			else people[i] = null;
		}
		
		numPeople--;
		return rtnPerson;

	}

}
