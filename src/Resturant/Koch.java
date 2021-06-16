package Resturant;

public class Koch {

	private String name;
	private String family;
	private int age;
	private boolean certified;
	private String cookingMethod;
	public Koch(String name, String family, int age, boolean certified, String cookingMethod) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
		this.certified = certified;
		this.cookingMethod = cookingMethod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isCertified() {
		return certified;
	}
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
	public String getCookingMethod() {
		return cookingMethod;
	}
	public void setCookingMethod(String cookingMethod) {
		this.cookingMethod = cookingMethod;
	}
	
	
	
	
	
	
}
