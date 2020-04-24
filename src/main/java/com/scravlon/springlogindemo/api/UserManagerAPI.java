package com.scravlon.springlogindemo.api;

import com.scravlon.springlogindemo.models.CarListingModel;
import com.scravlon.springlogindemo.models.CarMakeModel;
import com.scravlon.springlogindemo.service.CarListingService;
import com.scravlon.springlogindemo.service.CarMakePullerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserManagerAPI {

    @Autowired
    CarListingService carListingService;

    @Autowired
    CarMakePullerService carMakePullerService;


    @GetMapping("getmakes")
    public List<CarMakeModel> getMakes(){
        return carMakePullerService.getAllCarMakes();
    }

    @GetMapping("/getcars")
    public List<CarListingModel> getCars(){
        return carListingService.loadAllCars();
    }

    @GetMapping("/getcars/{make}")
    public List<CarListingModel> getCars(@PathVariable("make") String make){
        System.out.println(make);
        return carListingService.selectCarsByCarMake(make);
    }
}
