package basics;

public class Shopping {

	String productName;
	int price;
	String color;
	String brand;
	int quantity;
	
	public Shopping(String productName,int price,String color,String brand,int quantity) {
		this.productName=productName;
		this.price=price;
		this.color=color;
		this.brand=brand;
		this.quantity=quantity;
	}
	
	public void details() {
		System.out.print(productName+" ");
		System.out.print(price+" ");
		System.out.print(color+" ");
		System.out.print(brand+" ");
		System.out.println(quantity);
	}
	public static void main(String[] args) {
		Shopping s1 = new Shopping("Fan",1678,"White","Usha",5);
		s1.details();
		
		Shopping s2 = new Shopping("Car",100000,"Black","Nano",3);
		s2.details();
		
		Shopping s3 = new Shopping("Bike",200000,"Blue","Java",4);
		s3.details();
		
		Shopping s4 = new Shopping("Mobile",75000,"Grey","IPhone",2);
		s4.details();
		
		Shopping s5 = new Shopping("Fan",1678,"White","Usha",5);
		s5.details();
		
	}

}
