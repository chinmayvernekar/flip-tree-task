package com.chinmay.fliptreetask;

import com.chinmay.fliptreetask.model.MCUModel;
import com.chinmay.fliptreetask.repo.MCURepo;
import com.chinmay.fliptreetask.service.MCUService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class FlipTreeTaskApplication {

    @Autowired
    MCUService mcuService;

    @Autowired
    MCURepo mcuRepo;

    public static void main(String[] args) {
        SpringApplication.run(FlipTreeTaskApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
           if(mcuRepo.checkDataExist() == 0) {

                ObjectMapper mapper = new ObjectMapper();
                TypeReference<List<MCUModel>> typeReference = new TypeReference<List<MCUModel>>() {
                };
                InputStream inputStream = TypeReference.class.getResourceAsStream("/json/mcu.json");

                try {
                    List<MCUModel> parking = mapper.readValue(inputStream, typeReference);
                    mcuService.saveDetails(parking);
                    System.out.println("Details Saved");
                } catch (IOException e) {
                    System.out.println("Unable to save details " + e);
                }
            }else {
                System.out.println("Details Already Exist");
            }

        };
    }
}
