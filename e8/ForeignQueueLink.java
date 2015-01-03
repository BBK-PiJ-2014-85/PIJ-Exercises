package e8;

//Taken from BBK-PiJ-2014-22 and adapted as our "Person" classes were different. Main change is converting from my Person to his, and this now uses Person2, his version of Person.

public class ForeignQueueLink implements PersonQueue{

	private Person2 head;
	
	public Person2 getHead() {
		return head;
	}


	private void setHead(Person2 head) {
		this.head = head;
	}
	
	public void insert(Person person){
		
		Person2 convertPerson = new Person2(person.getName());
		
		if (head == null){
			head = convertPerson;
		}else {
			head.setNext(convertPerson);
		}
	}
	
	
	public Person retrieve(){
		if (this.getHead() == null){
			return null;
		}else{
			Person2 result = this.getHead();
			this.setHead(result.getNext());
			return result;
		}
	}
}
