package e8;

public class Supermarket {

	PersonQueue queue = new SupermarketPersonQueue();
	
	public void insert(Person person) {
	queue.insert(person);
	}

	public Person retrieve() {
	return queue.retrieve();

	}
	
}
