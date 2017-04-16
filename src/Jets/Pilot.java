package Jets;

public class Pilot {
	private String name;
	private float Salary;

	
	public Pilot() {
	}

	public Pilot(String name, float salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

}
