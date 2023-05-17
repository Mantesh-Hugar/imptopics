package abstraction;

abstract class A{
	abstract void add(int i,int j);
}
class Developer extends A{
	void add(int i,int j) {
		System.out.println(i+j);
	}
}
public class Calculator {
public static void main(String args[]) {
	Developer dev = new Developer();
	dev.add(10,20);
}
}
