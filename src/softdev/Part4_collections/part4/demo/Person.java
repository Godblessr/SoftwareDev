package softdev.Part4_collections.part4.demo;

public abstract class Person implements Comparable {

    public static int getNrOfCalls() {
        return nrOfCalls;
    }

    public static void incrementNrOfCalls() {
        nrOfCalls++;
    }

    public static void resetNrOfCalls() {
    	nrOfCalls = 0;
	}

    private static int nrOfCalls = 0;


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		return name.compareTo(((Person)o).getName());
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String name;

}
