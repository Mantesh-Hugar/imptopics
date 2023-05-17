package basics;

public class NonStaticVariable {

	int num=22;
	public static void details() {
		NonStaticVariable n1 = new NonStaticVariable();
		System.out.println(n1.num);
	}
	public static void main(String[] args) {
		details();

	}

}
