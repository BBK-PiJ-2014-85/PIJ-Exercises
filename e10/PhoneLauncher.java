package e10;

public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone sp = new SmartPhone("Nokia");
		
		sp.call("12345678");
		sp.call("1234345667784");
		sp.call("123451121221");
		sp.call("1233453221");
		sp.call("1234345432");
		sp.call("188776622678");
		sp.call("123478787878");
		sp.call("121238");
		sp.call("123345232");
		sp.call("123456723232328");
		sp.call("0012345");
		
		sp.printLastNumbers();
		sp.findPosition();
		sp.browseWeb("www.javahelp.com");
		sp.playGame("Minesweeper");
		sp.ringAlarm();	
		System.out.println(sp.getBrand());
		
		//TODO exercise 4.1 - not sure how you can gain visibility of it without creating a class and 
			//passing it in or rewriting method. neither of these seem minor so is there something else?
		//TODO exercise 4.2 - I dont think this is possible
	}
}
