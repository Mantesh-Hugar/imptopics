package basics;

/* public class Methods {

	public static void areaOfRect() {
		int l=10,b=2,area;
		area=l*b;
		System.out.println("Area of Rectangle :"+area);
	}
	public static void main(String args[]) {
		areaOfRect();
	}
} */


public class Methods{
	public static void main(String args[]) {
		areaOfSqr();
		areaOfTr();
	}
	
	public static void areaOfSqr() {
		int side=2,area;
		area=side*side;
		System.out.println("Area of Square :"+area);
	}
	
	public static void areaOfTr() {
		int height=3,bredth=4;
		float area_t;
		area_t=(0.5f)*height*bredth;
		System.out.println("Area of Triangle :"+area_t);
	}
}