package hello.exercise;

public class Book implements Printable {
	private String title;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public String toPrint() {
		return getTitle();
	}
}
