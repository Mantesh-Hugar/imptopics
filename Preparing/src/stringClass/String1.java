package stringClass;

public class String1 {
public static void main(String args[]) {
	
	char[] s2=new char[] {'a','b','c'};
	System.out.println(s2);
	StringBuilderDemo sb = new StringBuilderDemo("Mantesh");
	String s1 = new String(sb);
	System.out.println(s1);
}
}
