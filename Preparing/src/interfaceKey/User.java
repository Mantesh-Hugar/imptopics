package interfaceKey;

//
//interface ATM{
//		void deposite();
//		void withdraw();
//		abstract public void ministatement();
//}
//class ICICI implements ATM{
//	public void deposite() {
//		System.out.println("You can deposite upto 50k");
//	}
//	public void withdraw() {
//		System.out.println("You can withdraw upto 20k");
//	}
//	public void ministatement() {
//		System.out.println("***Messages***");
//	}
//}
//public class User {
//
//	public static void main(String[] args) {
//		ICICI c1 = new ICICI();
//		c1.deposite();
//		c1.withdraw();
//		c1.ministatement();
//
//	}
//
//}


interface Atm{
	void withdraw();
	void deposite();
	void ministatement();
}

interface Bank{
	void check();
}

class User implements Atm,Bank{
	public void withdraw() {
		System.out.println("We can withdraw upto 49k cash every day");
	}
	public void deposite() {
		System.out.println("We can deposite upto 1 LPD");
	}
	public void ministatement() {
		System.out.println("Display account transaction history");
	}
	public void check() {
		System.out.println("Withdraw money through check");
	}
	public static void main(String args[]) {
		User u1 = new User();
		u1.withdraw();
		u1.deposite();
		u1.ministatement();
		u1.check();
	}
}



























