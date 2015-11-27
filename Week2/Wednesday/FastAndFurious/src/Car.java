public abstract class Car {
	private String model;
	private int year;
	private int mileAge;
	
	public Car(){
		this("example", 2000, 1);
	}
	
	public Car(String model, int year, int mileAge){
		setModel(model);
		setYear(year);
		setMileAge(mileAge);
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileAge() {
		return mileAge;
	}

	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}

	public abstract boolean isEcoFriendly(boolean testing);
}
