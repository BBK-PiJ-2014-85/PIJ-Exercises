package e8;

public class e8_1_SupermarketQueue {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonQueue myQueue = new SupermarketPersonQueue();
		
		myQueue.insert(new Person("Hilda",34));
		myQueue.insert(new Person("Helder",76));
		System.out.println(myQueue.retrieve().getName());
		System.out.println(myQueue.retrieve().getName());
		
	}


}
