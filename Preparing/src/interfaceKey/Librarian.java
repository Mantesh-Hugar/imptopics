package interfaceKey;

interface Book {
	void bookname();

	void author();

	void dateofborrowing();
}

class java implements Book {
	public void bookname() {
		System.out.println("Book name is Java");
	}

	public void author() {
		System.out.println("Author of the book James Gosling");
	}

	public void dateofborrowing() {
		System.out.println("Date of Borrowing 2004");
	}
}

class Sql implements Book {
	public void bookname() {
		System.out.println("Book name is SQL");
	}

	public void author() {
		System.out.println("IDK");
	}

	public void dateofborrowing() {
		System.out.println("date of borrowing 2013");
	}
}

class Apti implements Book {
	public void bookname() {
		System.out.println("Book name is Aptitude");
	}

	public void author() {
		System.out.println("Autor is RS Agarwal");
	}

	public void dateofborrowing() {
		System.out.println("date of borrowing is 12-12-2000");
	}
}

public class Librarian {

	public static void main(String[] args) {
		java j1 = new java();
		j1.bookname();
		j1.author();
		j1.dateofborrowing();

		Sql s1 = new Sql();
		s1.bookname();
		s1.author();
		s1.dateofborrowing();

		Apti a1 = new Apti();
		a1.bookname();
		a1.author();
		a1.dateofborrowing();

	}

}
