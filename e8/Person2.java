package e8;

//Taken from BBK-PiJ-2014-22 as his Person class was different to mine and so I needed his class for exercie 3 to use a different persons class file. This extends my Person class to use this wherever possible

public class Person2 extends Person {


	private Person2 nextPerson;

	public Person2(String name){
		super(name,0);
	}
	
	@Override
	public String toString(){
		return super.getName();
	}
	
	public String getName(){
		return super.getName();
	}

	
	public Person2 getNext(){
		return this.nextPerson;
	}
	
	public void setNext(Person2 person){
		nextPerson = person;
	}
}
	
	
	

