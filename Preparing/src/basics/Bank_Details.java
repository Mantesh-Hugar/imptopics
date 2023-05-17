package basics;


class SBI{
	public void rateOfInterest() {
		System.out.println("10%");
	}
}

class ICICI extends SBI{
	public void rateOfInterest(){
		System.out.println("12%");
	}
}
class HDFC extends SBI{
	public void rateOfInterest() {
		System.out.println("16%");
	}
}
class CITI extends SBI{
	public void rateOfInterest() {
		System.out.println("8%");
	}
}
public class Bank_Details {

	public static void main(String[] args) {
		
		SBI s1 = new SBI();
		s1.rateOfInterest();
		
		ICICI c1 = new ICICI();
		c1.rateOfInterest();
		
		HDFC h1 = new HDFC();
		h1.rateOfInterest();
		
		CITI c2 = new CITI();
		c2.rateOfInterest();

	}

}
