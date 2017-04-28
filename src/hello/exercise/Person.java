package hello.exercise;

public class Person implements Printable {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	@Override
	public String toPrint() {
		return getFullName();
	}
}
