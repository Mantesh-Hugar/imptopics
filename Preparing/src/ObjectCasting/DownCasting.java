package ObjectCasting;
//class A{
//	public void run() {
//		System.out.println("Running");
//	}
//}
//class B extends A{
//	public void fly() {
//		System.out.println("Flying");
//	}
//}
//public class DownCasting {
//
//	public static void main(String[] args) {
//A a1=new B();
//a1.run();
//
//B b1=(B) a1;
//b1.run();
//b1.fly();
//
//	}
//
//}

class Police{
	public void lockdown() {
		System.out.println("Stay at home");
	}
}
class friend extends Police{
	public void meetingfriends() {
		System.out.println("Want see my friends once");
	}
}

public class DownCasting{
	public static void main(String args[]) {
		Police f1=new friend();
		f1.lockdown();
		
		friend f2=(friend) f1;
		f2.lockdown();
		f2.meetingfriends();
	}
}
