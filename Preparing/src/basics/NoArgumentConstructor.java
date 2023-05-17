package basics;

public class NoArgumentConstructor {

	String name;
	public NoArgumentConstructor(){
		name="Mantesh";
	}
	public static void main(String[] args) {
		NoArgumentConstructor c1 = new NoArgumentConstructor();
		System.out.println(c1.name);
		
		NoArgumentConstructor c2 = new NoArgumentConstructor();
		System.out.println(c2.name);
	}

}
