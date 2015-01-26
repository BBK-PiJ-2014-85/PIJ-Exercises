package e15;

import java.util.ArrayList;
import java.util.List;

public class CodeFlow {
	
	public CodeFlow(int num) {
		launch(num);
	}
	
	 public void launch(int userInput) 
	 { 
		 int line = 0;
		 List<Integer> intList = new ArrayList<Integer>();
		 intList.add(1);
		 intList.add(2);
		 intList.add(3);
		 intList.add(4);
		 intList.add(5);
		 intList.add(6);
		 try {
		 line = 10; intList.remove(0);
		 line = 11;System.out.println(intList.get(userInput));
		 line = 12;intList.remove(0);
		 line = 13; System.out.println(intList.get(userInput));
		 line = 14; intList.remove(0);
		 line = 15; System.out.println(intList.get(userInput));
		 line = 16; intList.remove(0);
		 line = 17; System.out.println(intList.get(userInput));
		 line = 18; intList.remove(0);
		 line = 19; System.out.println(intList.get(userInput));
		 line = 20; intList.remove(0);
		 line = 21; System.out.println(intList.get(userInput));
		 line = 22; intList.remove(0);
		 line = 23; System.out.println(intList.get(userInput));
		 } catch (IndexOutOfBoundsException ex) {
			 System.out.println("Line number exiting code for user input " + userInput + " is: " + line);
		ex.printStackTrace();
		 }
	 }
}
