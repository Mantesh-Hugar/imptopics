package abstraction;

abstract class Rbi{
	abstract public void minBal();
	abstract public void rateOfInterest();
	abstract public void aadharcardLink();
}

abstract class Sbi extends Rbi{

	int a=3000;
	String b="8%";
	public void minBal() {
		System.out.println("Minimum Balance "+a);
	}
	public void rateOfInterest() {
		System.out.println("Rate of Interest "+b);
	}
	
}

class Sbh extends Sbi {
	long c = 987612340987l;
	public void aadharcardLink() {
		System.out.println("Aadhar Card Link " + c);
	}
}

public class Cust {

	public static void main(String[] args) {

		Sbh sb1 = new Sbh();
		sb1.minBal();
		sb1.rateOfInterest();
		sb1.aadharcardLink();
	}

}
