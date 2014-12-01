package e10;

	/**
	* A phone makes calls
	*/
	public class OldPhone implements Phone {

		@Override
		public void call(String number) {
			System.out.println("You are calling ... " + number);
			
		}

		
	}

