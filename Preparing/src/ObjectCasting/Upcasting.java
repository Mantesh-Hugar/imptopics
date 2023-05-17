package ObjectCasting;

class A{
	public void run() {
		System.out.println("Running");
	}
}
class B extends A{
	public void fly() {
		System.out.println("Flying");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		A b1=new B();
		b1.run();

	}

}
