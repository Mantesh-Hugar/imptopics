package basics;

class Zomato{
	public void getRestaurants() {
		System.out.println("As per location");
	}
}
class Customer{
	public void getRestaurants() {
		System.out.println("As per review");
	}
}
public class Food {

	public static void main(String[] args) {
		Zomato z1 = new Zomato();
		z1.getRestaurants();
		
		Customer c1 = new Customer();
		c1.getRestaurants();
	}

}
