package basics;

public class Cars {
public void car_details(String cname,long price,String color,int capacity) {
	System.out.println("Car name :"+cname);
	System.out.println("Car price :"+price);
	System.out.println("Car color :"+color);
	System.out.println("Car capacity :"+capacity);
	System.out.println("******");
}
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.car_details("Nano",65000, "Yello", 4);
		c1.car_details("Maruthi", 600000,"White", 6);
		c1.car_details("Audi",123456789,"Black",6);

	}

}
