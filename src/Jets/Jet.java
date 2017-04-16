package Jets;

public class Jet {

	private String Model;
	private String Pilot;
	private int machSpeed;
	private int mphSpeed;
	private int range;
	private double price;
	
	
	
	public Jet() {
		
	}

	public Jet(String model, String pilot, int machSpeed, int mphSpeed, int range, double price) {
		super();
		Model = model;
		Pilot = pilot;
		this.machSpeed = machSpeed;
		this.range = range;
		this.price = price;
	}
	public Jet(String model, String pilot, int mphSpeed, int range, double price) {
		super();
		Model = model;
		Pilot = pilot;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getPilot() {
		return Pilot;
	}

	public void setPilot(String pilot) {
		Pilot = pilot;
	}

	public int getMachSpeed() {
		return this.mphSpeed/761;
	}

	public void setMachSpeed(int machSpeed) {
		this.machSpeed = machSpeed;
	}

	public int getMphSpeed() {
		return mphSpeed;
	}

	public void setMphSpeed(int mphSpeed) {
		this.mphSpeed = mphSpeed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [Model=");
		builder.append(Model);
		builder.append(", Pilot=");
		builder.append(Pilot);
		builder.append(", machSpeed=");
		builder.append(machSpeed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	

}
