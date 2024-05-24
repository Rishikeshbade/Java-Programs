package relationshipex;

public class Address {
	String addrLine, Street, City, State;
	String pincode;
	
	public Address() {
		addrLine = "Mauli Darshan";
		Street = "Kalundre Goan";
		City = "Panvel";
		State = "Maharshtra";
		pincode = "410289";
	}
	public Address(String addrLine, String Street, String City, String State, String pincode) {
		this.addrLine = addrLine;
		this.Street = Street;
		this.City = City;
		this.State = State;
		this.pincode = pincode;
	}
	
	public void display() {
		System.out.println(addrLine+" "+Street+" "+City+" "+State+" "+pincode);
	}

}
