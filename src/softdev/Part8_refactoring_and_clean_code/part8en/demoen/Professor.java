package softdev.Part8_refactoring_and_clean_code.part8en.demoen;


// Refactoring: use "Extract Superclass"... does it work?
public class Professor {

	public String name;
	public float length; // cm
	public float weight; // kg
	public String title;

	public Professor(String name, float length, float weight) {
		super();
		this.name = name;
		this.length = length;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getBMI(){
		float lengthInKg = length / 100.0f;
		return weight / (lengthInKg * lengthInKg);
	}

}
