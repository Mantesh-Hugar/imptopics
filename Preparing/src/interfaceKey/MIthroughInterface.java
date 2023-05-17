package interfaceKey;

//
//interface A{
//	void m1();
//}
//interface B{
//	void m2();
//}
//class C implements A,B{
//	public void m1() {
//		System.out.println("M1 Method");
//	}
//	public void m2() {
//		System.out.println("M2 Method");
//	}
//}
//public class MIthroughInterface {
//
//	public static void main(String[] args) {
//	C c1 = new C();
//	c1.m1();
//	c1.m2();
//
//	}
//
//}

interface A{
	void m1();
}
interface B{
	void m1();
}
class C implements A,B{
	public void m1() {
		System.out.println("M1 method");
	}
}

public class MIthroughInterface{
	public static void main(String args[]) {
		C c1 = new C();
		c1.m1();
	}
}
