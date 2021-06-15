package softdev.Part8_refactoring_and_clean_code.part8en.demoen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ExtractMethodTest extends JFrame {
	/*
	 * Refactoring:
	 * - extract method
	 * - inline variable (average)
	 * - extract local variable (number of matches)
	 * - inline method (getRating -> moreThanFiveLateDeliveries()
	 */
	int [] values = {1,2,3,4,5};
	private int numberOfLateDeliveries = 4;
	InternalClass myLittleObject;
	
	
	public ExtractMethodTest(String title) throws HeadlessException {
		super(title);
		setSize(500,500);
		setVisible(true);
		// Refactoring: convert anonymous to nested class
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clicked!");
			}
		});
	}
	

	// Refactoring: Convert Member Type to Top Level
public class InternalClass {
	private int numberOfPizzas = 28;
	private String name = "Pizza Quick";
	public int getNumberOfPizzas() {
		return numberOfPizzas;
	}
	public void setNumberOfPizzas(int numberOfPizzas) {
		this.numberOfPizzas = numberOfPizzas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
	
	public void localVariableTest(){
		// Refactoring: use "Convert Local Variable to Field"
		int numberOfDeliveries = 17;
		// ...
		System.out.println(numberOfDeliveries);
	}
	
	// Refactoring: Extract method
	public void calculateThings(){
		int sum = calculateSum();
		double average = calculateAverage((double) sum);
		printDetails(sum, average);
	}

	private void printDetails(int sum, double average) {
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}

	private double calculateAverage(double sum) {
		return sum / values.length;
	}

	private int calculateSum() {
		int sum = 0;
		for (int i = 0; i < values.length; i++)
			sum += values[i];
		return sum;
	}

	// Refactoring: Extract local variable
	public void calculateNumberOfMatches(){
		System.out.println("Number of matches = " + (values.length * (values.length - 1))/2);
		for (int number = 1; number <= (values.length * (values.length - 1))/2; number++)
			System.out.println("match number " + number);
	}
	
	
	public int getRating(){
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}
	
	public int getRating2(){
		return (moreThanFiveLateDeliveries()) ? 20 : 10;
	}

	// Refactoring: Inline
	private boolean moreThanFiveLateDeliveries() {
		return numberOfLateDeliveries  > 5;
	}

	public static void main (String[] args) {
		ExtractMethodTest test = new ExtractMethodTest("Test Frame");
		test.calculateThings();
		test.calculateNumberOfMatches();
		System.out.println("rating: " + test.getRating());
		System.out.println("rating2: " + test.getRating2());
	}

}
