package basics;

public class Car {
	
	String carname;
	String carcolor;
	int carprice;
	int carcapacity;
	String carmodel;

	public Car(String name, String color) {
		carname = name;
		carcolor = color;
	}

	public Car(String name, String color, int price) {
		carname = name;
		carcolor = color;
		carprice = price;
	}

	public Car(String name, String color, int price, int capacity, String model) {
		carname = name;
		carcolor = color;
		carprice = price;
		carcapacity = capacity;
		carmodel = model;
	}

	public static void main(String[] args) {
		Car c1 = new Car("Nano", "Yello");
		System.out.println(c1.carname + " " + c1.carcolor);

		Car c2 = new Car("Maruthi", "white", 100000);
		System.out.println(c2.carname + " " + c2.carcolor + " " + c2.carprice);

		Car c3 = new Car("Audi", "blue", 500000, 5, "Tata123");
		System.out
				.print(c3.carname + " " + c3.carcolor + " " + c3.carprice + " " + c3.carcapacity + " " + c3.carmodel);

	}

}
