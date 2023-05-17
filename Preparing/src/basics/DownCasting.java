package basics;

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
public class DownCasting {

	public static void main(String[] args) {
		A b1 = new B();
		
		B a1=(B) b1;
		a1.run();
		a1.fly();

	}

}
