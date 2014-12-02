package e10;

	/**
	* A phone makes calls
	*/
	public class OldPhone implements Phone {

		private String brand = null;
		
		public OldPhone(String brand) {
		this.brand = brand;
		}
		
		public String getBrand() {
		return brand;
		}
		
		
		@Override
		public void call(String number) {
			System.out.println("You are calling ... " + number);
			
		}

		
	}

