package main;

public class Customer {
	
	private String firstName,
		middleInitial,
		lastName,
		address,
		city,
		state;
	
	private int zip;
	
	private Gender gender;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String middleInitial, String lastName, Gender gender,
			String address, String city, String state, int zip) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	//getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleInitial() {
		return middleInitial;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	//setters
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setMiddleInitial(String mi) {
		this.middleInitial = mi;
	}
	
	public void setLastName(String ln) {
		this.lastName = ln;
	}
	
	public void setGender(Gender g) {
		this.gender = g;
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String s) {
		this.state = s;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
}
