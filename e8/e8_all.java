package e8;

public class e8_all {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonQueue myQueue = new SupermarketPersonQueue();
		
		myQueue.insert(new Person("Hilda",34));
		myQueue.insert(new Person("Helder",76));
		System.out.println(myQueue.retrieve().getName());
		System.out.println(myQueue.retrieve().getName());
		
		System.out.println("Exercise 4.1: unfair queues:");
		PersonQueue myQueue4_1 = new SimpleUnfairQueue_4_1();
		myQueue4_1.insert(new Person("Hilda",34));
		myQueue4_1.insert(new Person("Helder",76));
		System.out.println(myQueue4_1.retrieve().getName());
		System.out.println(myQueue4_1.retrieve().getName());
		
		System.out.println("Exercise 4.2: Clustered Queues");
		PersonQueue myQueue4_2 = new ClusteredQueue();
		myQueue4_2.insert(new Person("Tom", 25));
		myQueue4_2.insert(new Person("Dick", 26));
		myQueue4_2.insert(new Person("Harry", 66));
		myQueue4_2.insert(new Person("Fred", 5));
		System.out.println(myQueue4_2.retrieve().getName());
		System.out.println(myQueue4_2.retrieve().getName());
		System.out.println(myQueue4_2.retrieve().getName());
		System.out.println(myQueue4_2.retrieve().getName());
		
		
		System.out.println("\n Exercise 5.1: Hash tables:");
		System.out.println(HashUtilities.shortHash(-456779372));
		String str = "Going to an int";
		System.out.println(HashUtilities.shortHash(str.hashCode()));
		
		System.out.println("\n Exercise 5.2: SimpleMap:");
		SimpleMap map = new MySimpleMap();
		map.put(7, "Lucky for some");
		map.put(5, "Luckyt ofor someone?");
		map.put(13, "Unlucky for some");
		map.put(13, "Lucky for all");
		map.put(1000000, "Lucky for those with this salary");
		map.remove(5);
		System.out.println(map.get(55));
		System.out.println(map.get(13));

		
	}


}
