package be.kuleuven.groept.softdev.part8.demoen;

import java.util.Date;

public class IntroduceParameterObject {

	public void addCustomer(Customer customer) {
		// code to add information of a new client into the repository
	}

	public void findByName(Customer customer, String search) {
		// code to look for a client in the repository
	}

	public void changeStreet(Customer customer, String newStreet) {
		// code to change the street information
	}

	public static void main (String[] args){
		new IntroduceParameterObject().changeStreet(new Customer("a", new Date(), "b", "l"), "x");
	}
}
