package com.chinmay.fliptreetask.controller;

import com.chinmay.fliptreetask.model.MCUModel;
import com.chinmay.fliptreetask.service.MCUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MCUController {

    @Autowired
    MCUService mcuService;

    @GetMapping("/mcu-response")
    public List<Object> getAll() {
        return mcuService.getAll();
    }

    @PutMapping("/update-movie-ratingName")
    public ResponseEntity<?> updateRating(@RequestParam(name = "movieId",required = true) Integer movieId,
                                          @RequestParam(name = "ratingName",required = true) String ratingName){
       return   mcuService.updateRating(movieId,ratingName);
    }
}
