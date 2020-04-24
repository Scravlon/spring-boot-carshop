package com.scravlon.springlogindemo.service;

import com.scravlon.springlogindemo.dao.CarListingRepository;
import com.scravlon.springlogindemo.models.CarListingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarListingService {

    @Autowired
    CarListingRepository carListingRepository;

    public List<CarListingModel> loadAllCars(){
        return carListingRepository.findAll();
    }

    public List<CarListingModel> selectCarsByCarMake(String carmake){
            return carListingRepository.selectMake(carmake);
    }

    public void insertNewCar(CarListingModel carlistingModel) {carListingRepository.save(carlistingModel);};
}
