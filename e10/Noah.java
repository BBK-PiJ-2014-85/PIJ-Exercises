package e10;

public class Noah {

	public static void main (String[] args)
	{
		Animal bears = new LandMammal("bears");
		Animal beetles = new LandEggLaying("beetles");
		Animal cats = new LandMammal("cats");
		Animal crocodiles = new LandEggLaying("crocodiles"); //Assuming for the purposes of a worldwide flood, these need land!
		Animal dogs = new LandMammal("dogs");
		Animal dolphins = new AquaticMammal("dolphins");
		Animal eagles = new FlyingEggLaying("eagles");
		Animal flies = new FlyingEggLaying("flies");
		Animal frogs = new LandEggLaying("frogs");
		Animal lizards = new LandEggLaying("lizards");
		Animal monkeys = new LandMammal("monkeys");
		Animal pigeons = new FlyingEggLaying("pigeons");
		Animal salmon = new AquaticEggLaying("salmon");
		Animal sharks = new AquaticEggLaying("sharks");
		Animal snakes = new LandEggLaying("snakes");
		Animal whales = new AquaticMammal("whales");
		
		testAnimal(bears);
		testAnimal(beetles);
		testAnimal(cats);
		testAnimal(crocodiles);
		testAnimal(dogs);
		testAnimal(dolphins);
		testAnimal(eagles);
		testAnimal(flies);
		testAnimal(frogs);
		testAnimal(lizards);
		testAnimal(monkeys);
		testAnimal(pigeons);
		testAnimal(salmon);
		testAnimal(sharks);
		testAnimal(snakes);
		testAnimal(whales);
		
		
		
		
		
	}
	
	public static void testAnimal(Animal animal)
	{
		animal.call();
		animal.makeSound();
		animal.reproduce();
	}
	
	
}

class LandMammal extends AnimalImpl implements Mammal {

	public LandMammal(String name) {
		super(name);
	}
}

class LandEggLaying extends AnimalImpl implements EggLaying {

	public LandEggLaying(String name) {
		super(name);
	}
}

class AquaticMammal extends Aquatic implements Mammal {

	public AquaticMammal(String name) {
		super(name);
	}
}

class FlyingEggLaying extends Flying implements EggLaying {

	public FlyingEggLaying(String name) {
		super(name);
	}
}

class AquaticEggLaying extends Aquatic implements EggLaying {

	public AquaticEggLaying(String name) {
		super(name);
	}
}


