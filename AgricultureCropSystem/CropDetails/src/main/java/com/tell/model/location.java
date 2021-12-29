package com.tell.model;

public class location {
  private String village;
  private String city;
  private String district;
  private String state;
  private String landmark;
  private String pincode;
  

  
  @Override
public String toString() {
	return "location [village=" + village + ", city=" + city + ", district=" + district + ", state=" + state
			+ ", landmark=" + landmark + ", pincode=" + pincode + "]";
}



//Constructor using field
  public location(String village, String city, String district, String state, String landmark, String pincode) {
		super();
		this.village = village;
		this.city = city;
		this.district = district;
		this.state = state;
		this.landmark = landmark;
		this.pincode = pincode;
	}


  
//Constructor is created from superclass
	public location() {
	super();
}



  
  //getters and setters are created
  public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	  
  
}
