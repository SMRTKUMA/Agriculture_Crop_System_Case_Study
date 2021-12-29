package com.tell;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.tell.exceptions.EmptyInputExceptions;
import com.tell.model.CropDetails;
import com.tell.model.location;
import com.tell.repository.CropDetailsRepository;
import com.tell.service.CropService;
@RunWith(SpringRunner.class)
@SpringBootTest
class CropDetailsApplicationTests {
	@Autowired
	CropService cropService;
	
	@MockBean
	CropDetailsRepository cropDetailsRepository;

	@Test
	public void getAllCropTest() {
		when(cropDetailsRepository.findAll()).thenReturn((List<CropDetails>) Stream.of
		(new CropDetails(1,"Fruit","Banana","7kg","900","Pratiksha Bhosle", new location("karad","karad","satara","maharashtra","NH4","321748")),
		new CropDetails(2,"Fruit","Mango","9kg","1000","Pratiksha Bhosle", new location("karad","karad","satara","maharashtra","NH4","321748"))
		)
		.collect(Collectors.toList()));

		assertEquals(2,cropService.getAll().size());
                }
	
	@Test
	public CropDetails save() throws EmptyInputExceptions
	{
		CropDetails cropDetails = new CropDetails(1,"Fruit","Banana","7kg","900","Pratiksha Bhosle", new location("karad","karad","satara","maharashtra","NH4","321748"));
	when(cropDetailsRepository.save(cropDetails)).thenReturn(cropDetails);
	assertEquals(cropDetails,cropService.save(cropDetails));
	return cropDetails;
	}
	
/*	@Test
	public void deleteCropDetails() throws EmptyInputExceptions
	{
    CropDetails cropDetails = new CropDetails(1,"Fruit","Banana","7kg","900","Pratiksha Bhosle", new location("karad","karad","satara","maharashtra","NH4","321748"));
	when(cropDetailsRepository.save(cropDetails)).thenReturn(cropDetails);
    cropService.deleteCropDetails(cropDetails, 4);
	verify(cropDetailsRepository,times(4)).delete(cropDetails);
	}
	@Test
	public void updateCropDetails() throws EmptyInputExceptions
	{
	CropDetails cropDetails= new CropDetails(1,"Fruit","Banana","7kg","900","Pratiksha Bhosle", new location("karad","karad","satara","maharashtra","NH4","321748"));
	when(cropDetailsRepository.save(cropDetails)).thenReturn(cropDetails);
	cropService.getCropDetailsById(cropDetails, 4);
	verify(cropDetailsRepository,times(1)).save(cropDetails);
	}

	@Test
	public void deleteCropDetails() throws EmptyInputExceptions
	{
	String test = cropService.deleteByProductId(null, 4);
	assertEquals("Id deleted ",test);
	CropDetails product = new CropDetails(4,"Toy","Ship","Toys","doc.jpd",2000,0,"good");
	cropDetailsRepository.save(product);
	}
*/
}
