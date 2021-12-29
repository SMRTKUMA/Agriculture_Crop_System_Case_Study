package com.tell.service;

import java.util.List;
import java.util.Optional;

import com.tell.model.CropDetails;

public interface DealerService {

	List<CropDetails> getAll1();

	Optional<CropDetails> getCropDetailsById1(String cropId);

	Optional<CropDetails> getCropDetailsByName1(String cropName);

	Optional<CropDetails> getCropDetailsByType1(String cropType);

}
