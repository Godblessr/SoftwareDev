package softdev.Part4_collections.part4.demo;

public class PersonWithUniqueHashCode extends Person {

	public PersonWithUniqueHashCode(String name) {
		super(name);
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		Person.incrementNrOfCalls();
		return result;
	}
}
