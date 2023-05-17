package abstraction;

abstract class RBI {
	abstract public void minBal(int i);
	abstract public void rateofInterest(float f);
}

 class SBI extends RBI {
	public void minBal(int i) {
		System.out.println("Minimum Balance " + i);
	}

	public void rateOfInterest(float f) {
		System.out.println("Rate of interest " + f);
	}
}

public class Customer {

	public static void main(String[] args) {
		SBI s1 = new SBI();
		s1.minBal(2000);
		s1.rateOfInterest(6.5f);
	}

}


