package com.scravlon.springlogindemo.api;

import com.scravlon.springlogindemo.models.CarListingModel;
import com.scravlon.springlogindemo.service.CarListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserManagerAPI {

    @Autowired
    CarListingService carListingService;

    @GetMapping("/getcars")
    public List<CarListingModel> getCars(){
        return carListingService.loadAllCars();
    }


}
