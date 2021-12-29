package com.tell.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tell.exceptions.CropDetailsNotFoundException;
import com.tell.exceptions.EmptyInputExceptions;
import com.tell.model.CropDetails;
import com.tell.repository.CropDetailsRepository;

@Service
public class DealerServiceImpl implements DealerService {

	@Autowired
	private CropDetailsRepository cropDetailsRepository;
	
	
	//find all cropdetails
			@Override
			public List<CropDetails> getAll1(){
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
			public Optional<CropDetails> getCropDetailsById1(String cropId){
				Optional<CropDetails> findById= cropDetailsRepository.findById(cropId);
				if(findById.isEmpty() ) {
					throw new CropDetailsNotFoundException("603","Data is not found in DB");
				}
				else {
					return cropDetailsRepository.findById(cropId);
				}
			}
			

			
			
			@Override
			public Optional<CropDetails>getCropDetailsByName1(String cropName){
				return cropDetailsRepository.findByCropName( cropName);
			}
			
			
			@Override
			public Optional<CropDetails>getCropDetailsByType1(String cropType){
				return cropDetailsRepository.findByCropType(cropType);
			}
}
