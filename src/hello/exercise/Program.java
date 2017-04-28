package hello.exercise;

public class Program {

	public static void main(String[] args) {
		Person sivan = new Person("Sivan", "Patel");
		Book book = new Book("Programming Ruby");
		
		Printer printer = new Printer();
		printer.print(sivan);
		printer.print(book);
	}

}