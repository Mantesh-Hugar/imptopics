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
public class Program {

	public static void main(String[] args) {
		
A a1 = new A();
a1.run();

B b1 = new B();
b1.fly();
b1.run();
	}

}
