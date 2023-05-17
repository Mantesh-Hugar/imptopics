package basics;

public class Payment_Model {

	public static void payment(String wallettype,String UID) {
		System.out.println("Wallet type "+wallettype);
		System.out.println("UID "+UID);
	}
	
	public static void payment(String cardtype,long cardno,int cvvnumber) {
		System.out.println("Card type "+cardtype);
		System.out.println("Card Number "+cardno);
		System.out.println("cvv number "+cvvnumber);
	}
	public static void payment(String type,String username,int pwd,long accountnumber) {
		System.out.println("Type "+type);
		System.out.println("Username "+username);
		System.out.println("Password "+pwd);
		System.out.println("Account number "+accountnumber);
	}
	public static void main(String[] args) {
		payment("Google Pay","hdfc123@");
		payment("Debit card", 123456789l,1234);
		payment("Saving", "Mantesh Hugar", 1234567, 1234567890);
	}

}
