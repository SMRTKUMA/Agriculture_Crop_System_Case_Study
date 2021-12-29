package com.tell.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tell.model.CropDetails;
import com.tell.service.CropService;
import com.tell.service.DealerService;

@RestController
@RequestMapping("/api/crops")
public class CropDetailsController {

	
	@Autowired
	CropService cropService ;
	
	@Autowired
	DealerService dealerService;
	
	
	
	
	//add the cropdetails-->farmer
	@PostMapping("/add")
	public CropDetails save( CropDetails cropdetails) {
		cropdetails.setCropId(UUID.randomUUID().toString());
		return cropService.save(cropdetails);
	}
	
	
	
	//update the cropDetails-->farmer
	@PutMapping("/update/{cropId}")
	public String updateCropDetails(@RequestBody CropDetails cropdetails,@PathVariable String cropId) {
		return cropService.updateCropDetails(cropdetails, cropId);
	}
	//delete the cropDetails-->farmer
	@DeleteMapping("/delete/{cropId}")
	public String deleteCropDetails(@PathVariable String cropId) {
		return cropService.deleteCropDetails(cropId);
	}
	
	
	
	//find all cropdetails-->farmer
		@GetMapping("/findAllcropdetails")
		public List<CropDetails> getAll(){
			return cropService.getAll();
		}
		
		
		
		//find the cropdetails by id-->farmer
		@GetMapping("/findAllCropDetails/{cropId}")
		public Optional<CropDetails> getCropDetails(@PathVariable String cropId){
			return cropService.getCropDetailsById(cropId);
		}
		
		
		//find the cropdetails by name-->farmer
		@GetMapping("/findAllCrops/{cropName}")
		public Optional<CropDetails> getCropDetailsByName(@PathVariable String cropName){
			return cropService.getCropDetailsByName(cropName);
		}
		
		//find the cropdetails by type-->farmer
		@GetMapping("/findAllCropsByType/{cropType}")
		public Optional<CropDetails>getCropDetailsByType(@PathVariable String cropType){
			return cropService.getCropDetailsByType(cropType);
		}









		//find all cropdetails-->dealer
				@GetMapping("/findAllcropdetailsDealer")
				public List<CropDetails> getAll1(){
					return dealerService.getAll1();
				}
				
				
				
				//find the cropdetails by id-->dealer
				@GetMapping("/findAllCropDetailsDealer/{cropId}")
				public Optional<CropDetails> getCropDetails1(@PathVariable String cropId){
					return dealerService.getCropDetailsById1(cropId);
				}
				
				
				//find the cropdetails by name-->dealer
				@GetMapping("/findAllCropsDealer/{cropName}")
				public Optional<CropDetails> getCropDetailsByName1(@PathVariable String cropName){
					return dealerService.getCropDetailsByName1(cropName);
				}
				
				//find the cropdetails by type-->dealer
				@GetMapping("/findAllCropsByTypeDealer/{cropType}")
				public Optional<CropDetails>getCropDetailsByType1(@PathVariable String cropType){
					return dealerService.getCropDetailsByType1(cropType);
				}



        





}
