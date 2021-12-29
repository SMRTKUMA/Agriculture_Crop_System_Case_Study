package com.tell.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CropDetails")
public class CropDetails {
@Id
 private String cropId;	
 private String cropType;
 private String cropName;
 private String cropPrice;
 private String cropQuantity;
 private String uploaded_by;
 private location location;

 
 @Override
public String toString() {
	return "Crop [cropId=" + cropId + ", cropType=" + cropType + ", cropName=" + cropName + ", cropPrice=" + cropPrice
			+ ", cropQuantity=" + cropQuantity + ", uploaded_by=" + uploaded_by + ", location=" + location + "]";
}





public CropDetails(String cropId, String cropType, String cropName, String cropPrice, String cropQuantity,
		String uploaded_by, com.tell.model.location location) {
	super();
	this.cropId = cropId;
	this.cropType = cropType;
	this.cropName = cropName;
	this.cropPrice = cropPrice;
	this.cropQuantity = cropQuantity;
	this.uploaded_by = uploaded_by;
	this.location = location;
}





//Constructor is created from superclass
public CropDetails() {
	super();
}


public CropDetails(int i, String cropType2, String cropName2, String cropPrice2, String cropQuantity2,
		String uploaded_by2, com.tell.model.location location2) {
	// TODO Auto-generated constructor stub
}





//getters and setters are created
public String getCropId() {
	return cropId;
}
public void setCropId(String cropId) {
	this.cropId = cropId;
}
public String getCropName() {
	return cropName;
}
public void setCropName(String cropName) {
	this.cropName = cropName;
}
public String getCropPrice() {
	return cropPrice;
}
public void setCropPrice(String cropPrice) {
	this.cropPrice = cropPrice;
}
public String getCropType() {
	return cropType;
}
public void setCropType(String cropType) {
	this.cropType = cropType;
}
public String getCropQuantity() {
	return cropQuantity;
}
public void setCropQuantity(String cropQuantity) {
	this.cropQuantity = cropQuantity;
}
public location getLocation() {
	return location;
}
public void setLocation(location location) {
	this.location = location;
}
public String getUploaded_by() {
	return uploaded_by;
}
public void setUploaded_by(String uploaded_by) {
	this.uploaded_by = uploaded_by;
}




 
}