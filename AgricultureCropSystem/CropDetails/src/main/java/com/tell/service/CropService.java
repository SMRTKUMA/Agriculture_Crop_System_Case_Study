package com.tell.service;

import java.util.List;
import java.util.Optional;

import com.tell.model.CropDetails;
public interface CropService {
	
	public CropDetails save( CropDetails cropdetails);
	public List<CropDetails> getAll();
	public Optional<CropDetails> getCropDetailsById(String cropId);
	public String deleteCropDetails( String cropId);
	public String updateCropDetails( CropDetails cropDetails, String cropId);
	public Optional<CropDetails>getCropDetailsByName(String cropName);
	Optional<CropDetails> getCropDetailsByType(String cropType);
	

}