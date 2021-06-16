package Resturant;

public class Resturant {

	
	private String name;
	private String address;
	private int capacity;
	public Resturant(String name, String address, int capacity) {
		super();
		this.name = name;
		this.address = address;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
