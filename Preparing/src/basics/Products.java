package basics;

public class Products {

	static String pdtname1 = "Laptop", pdtname2 = "Mobile";
	static String pdtmodel1 = "Dell", pdtmodel2 = "Apple";

	String pdtcolor1 = "Black", pdtcolor2 = "Blue";
	int pdtprice1 = 100000, pdtprice2 = 78000;

	public static void pdt1_details() {
		System.out.println("Product1 name " + pdtname1);
		System.out.println("Product1 model " + pdtmodel1);

		Products p1 = new Products();
		System.out.println("Product1 color " + p1.pdtcolor1);
		System.out.println("Product1 price " + p1.pdtprice1);
		System.out.println("######################");
	}

	public void pdt2_details() {
		System.out.println("Product2 name " + pdtname2);
		System.out.println("Product2 model " + pdtmodel2);
		System.out.println("Product2 color " + pdtcolor2);
		System.out.println("Product2 price " + pdtprice2);
	}

	public static void main(String[] args) {
		pdt1_details();

		Products p2 = new Products();
		p2.pdt2_details();

	}

}
