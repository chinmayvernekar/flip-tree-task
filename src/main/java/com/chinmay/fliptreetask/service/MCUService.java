package com.chinmay.fliptreetask.service;

import com.chinmay.fliptreetask.model.MCUModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MCUService {

    public List<Object> getAll();

    public void saveDetails(List<MCUModel> parking);

    public ResponseEntity<?> updateRating(Integer movieId,String ratingName);
}
