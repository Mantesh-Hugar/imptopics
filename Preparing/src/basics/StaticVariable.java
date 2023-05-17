package basics;

public class StaticVariable {

	static String pname="Laptop",colour="Black",model="Dell";
	static int price=49999;
	public static void details() {
		System.out.println("Product name "+pname);
		System.out.println("Product colour "+colour);
		System.out.println("Product model "+model);
		System.out.println("Product price "+price);
	}
	public static void main(String[] args) {
		details();

	}

}
