package e10;

public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String webpage)
	{
		System.out.println("Browsing page " + webpage);
	}
	
	public void findPosition()
	{
		System.out.println("You are 10m east of a Rock and 10m west of a hard place.");
	}
	
	@Override
	public void call(String number)
	{
		if (number.length() >= 2 && number.substring(0,2).equals("00"))
		{
			System.out.println("Calling " + number + " though the internet to save money.");
			super.updateCallList(number);
		}
		else super.call(number);
		
	}

}
