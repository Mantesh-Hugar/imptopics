package basics;

//class Parents{
//	public void marriage() {
//		System.out.println("Arrange Marriage");
//	}
//}
//
//class Son extends Parents{
//	public void marriage() {
//		System.out.println("Love Marriage");
//	}
//}
//public class Society {
//
//	public static void main(String[] args) {
//	Son s1 = new Son();
//	s1.marriage();
//	s1.marriage();
//
//	}
//
//}

//class Parents {
//	public void marriage() {
//		System.out.println("Arrange Marriage");
//	}
//}
//
//class Son extends Parents {
//	public void marriage() {
//		System.out.println("Love Marriage");
//	}
//
//	public void friends() {
//		marriage();
//	}
//}
//
//public class Society {
//	public static void main(String args[]) {
//		Son s1 = new Son();
//		s1.friends();
//	}
//}




//class Parents{
//	public void marriage() {
//		System.out.println("Arrange Marriage");
//	}
//}
//class Son extends Parents{
//	public void marriage() {
//		System.out.println("Love marriage");
//	}
//	public void friends() {
//		super.marriage();
//	}
//}
//
//public class Society{
//	public static void main(String args[]) {
//		Son s1 = new Son();
//		s1.friends();
//	}
//}



class Parents{
	public void marriage() {
		System.out.println("Arrange Marriage");
	}
}
class Son extends Parents{
	public void marriage() {
		System.out.println("Love Marriage");
	}
	public void friends() {
		marriage();
		super.marriage();
	}
}

public class Society{
	public static void main(String args[]) {
		Son s1 = new Son();
		s1.friends();
	}
}























