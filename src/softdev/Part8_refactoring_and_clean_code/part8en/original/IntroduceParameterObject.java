package softdev.Part8_refactoring_and_clean_code.part8en.original;

import java.util.Date;

public class IntroduceParameterObject {

	public void addCustomer(String name, Date birthday, String street, String city) {
		// code to add information of a new client into the repository
	}

	public void findByName(String name, Date birthday, String street, String city, String search) {
		// code to look for a client in the repository
	}

	public void changeStreet(String name, Date birthday, String street, String city, String newStreet) {
		// code to change the street information
	}

	public static void main (String[] args){
		new IntroduceParameterObject().changeStreet("a", new Date(), "b", "l", "x");
	}
}
