package softdev.Part4_collections.part4.demo;

public class PersonWithoutUniqueHashCode extends Person {

	public PersonWithoutUniqueHashCode(String name) {
		super(name);
	}

	@Override
	public int hashCode() {
		Person.incrementNrOfCalls();
		return 5; // very bad hashcode, but ... it's not wrong!
	}
}
