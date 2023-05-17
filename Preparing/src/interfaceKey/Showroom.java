package interfaceKey;

interface Car{
	void carname();
	void color();
	void price();
}
abstract class Audi implements Car{
	public void carname() {
		System.out.println("Car name Audi");
	}
	public void color() {
		System.out.println("Car color White");
	}
}
class Audimodels extends Audi{
	public void price() {
		System.out.println("Car price is 200000");
	}
}
public class Showroom {

	public static void main(String[] args) {
		Audimodels a1 = new Audimodels();
		a1.carname();
		a1.color();
		a1.price();

	}

}
