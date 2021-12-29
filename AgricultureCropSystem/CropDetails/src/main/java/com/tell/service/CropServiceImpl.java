package com.tell.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tell.exceptions.EmptyInputExceptions;
import com.tell.exceptions.CropDetailsNotFoundException;
import com.tell.model.CropDetails;
import com.tell.repository.CropDetailsRepository;


@Service
public class CropServiceImpl implements CropService{
	@Autowired
	private CropDetailsRepository cropDetailsRepository ;
	
	//save the cropdetails
		@Override
		public CropDetails save( CropDetails cropdetails) {
			if(cropdetails.getCropName().isBlank()||cropdetails.getCropName().length()==0) {
				throw new EmptyInputExceptions("601","Input fields are empty");
			}
			CropDetails e =  cropDetailsRepository.save(cropdetails);
			return e;
			
//			cropDetailsRepository.save(cropdetails);
//			return ("Added cropdetails with id: " + cropdetails.getCropID());
		}
		
		//find all cropdetails
		@Override
		public List<CropDetails> getAll(){
			List<CropDetails> cropList = cropDetailsRepository.findAll();
			if(cropList.isEmpty()) {
				throw new EmptyInputExceptions("602","Crop list is completely empty");
			}
			else {
				return cropList;
			}
		}
		
		//find the cropdetails by id
		@Override
		public Optional<CropDetails> getCropDetailsById(String cropId){
			Optional<CropDetails> findById= cropDetailsRepository.findById(cropId);
			if(findById.isEmpty() ) {
				throw new CropDetailsNotFoundException("603","Data is not found in DB");
			}
			else {
				return cropDetailsRepository.findById(cropId);
			}
		}
		
		//delete the cropdetails by id
		@Override 
		public String deleteCropDetails( String cropId) {
			boolean isCropExist=cropDetailsRepository.existsById(cropId);
			if(isCropExist) {
				cropDetailsRepository.deleteById(cropId);
				return "CropDetails deleted";
			}
			else {
				throw new CropDetailsNotFoundException("603","Data is not found in DB");
			}
			
		}
	
		
		//update the cropdetails by id
		@Override
		public String updateCropDetails( CropDetails cropDetails, String cropId) {
			boolean isCropExist=cropDetailsRepository.existsById(cropId);
			if(isCropExist)
				{
				cropDetailsRepository.save(cropDetails);
				return "Update cropdetails with id: "+cropId;
				}
			else {
				throw new CropDetailsNotFoundException("603","Data is not found in DB");
			}
			
		}
		
		
		@Override
		public Optional<CropDetails>getCropDetailsByName(String cropName){
			Optional<CropDetails> Name=cropDetailsRepository.findByCropName(cropName);
			if(Name.isEmpty()) {
				throw new CropDetailsNotFoundException("604","Data not found");
			}else {
			return Name;
			}
		}
		
		
		@Override
		public Optional<CropDetails>getCropDetailsByType(String cropType){
			Optional<CropDetails> Type=cropDetailsRepository.findByCropType(cropType);
			if(Type.isEmpty()) {
				throw new CropDetailsNotFoundException("605","Data not found");
			}
			else {
			return Type;
		}

	
}
}