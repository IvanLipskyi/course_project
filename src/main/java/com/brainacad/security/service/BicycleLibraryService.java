package com.brainacad.security.service;

import com.brainacad.security.dao.BicycleRepository;
import com.brainacad.security.entity.Bicycle;
import org.springframework.stereotype.Service;

@Service
public class BicycleLibraryService {

    private final BicycleRepository bicycleRepository;

    public BicycleLibraryService(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }
    public void addNewBicycle(Bicycle bicycle){
        bicycleRepository.save(bicycle);
    }
}
