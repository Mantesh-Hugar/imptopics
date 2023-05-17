package basics;

public class Bank {

	static String BankName = "HDFC", Address = "Hyderabad", ACHolderName = "Mantesh", IFSC = "HDFC0068";
	int minBalance = 1000, availableBalance = 5000;
	String AcType = "Saving";

	public static void bankdetails() {
		System.out.println("Bank Name " + BankName);
		System.out.println("Address of the bank " + Address);
		System.out.println("Account Holder Name " + ACHolderName);
		System.out.println("Bank IFSC Code " + IFSC);

		Bank b1 = new Bank();
		System.out.println("Minimum Balance "+b1.minBalance);
		System.out.println("Available balance " + b1.availableBalance);
		System.out.println("Account Type " + b1.AcType);
	}

	public static void main(String[] args) {
		bankdetails();
	}

}
