package com.chinmay.fliptreetask.service;

import com.chinmay.fliptreetask.model.MCUModel;
import com.chinmay.fliptreetask.repo.MCURepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.*;

@Service
public class MCUServiceImpl implements MCUService{

    @Autowired
    MCURepo mcuRepo;


    @Override
    public List<Object> getAll() {
        return null;
    }

    @Override
    public void saveDetails(List<MCUModel> parking) {
        mcuRepo.saveAll(parking);
    }

    @Override
    public ResponseEntity<?> updateRating(Integer movieId,String ratingName) {

        MCUModel mcuUpdateRating = null;
       try {

            MCUModel movieId1 = mcuRepo.findById(movieId).orElseThrow();

            movieId1.setRating_name(ratingName);

           mcuUpdateRating = mcuRepo.save(movieId1);

       }catch (Exception e){
           System.out.println("Error: " + e);
       }

       return ResponseEntity.ok(mcuUpdateRating);
    }
}
