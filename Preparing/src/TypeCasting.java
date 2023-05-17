//1. Widening
//public class TypeCasting {
//
//	public static void main(String[] args) {
//		int i=10;
//		long l=i;
//		float f=l;
//		double d=f;
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
//	}
//
//}

//public class TypeCasting{
//	public static void main(String args[]) {
//		byte b1=10,b2=5;
//		int c=b1*b2;
//		System.out.println(c);
//	}
//}


//2. Narrowing

public class TypeCasting{
	public static void main(String args[]) {
		double d=785215.568;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
	}
}