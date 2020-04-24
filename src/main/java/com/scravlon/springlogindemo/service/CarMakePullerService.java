package com.scravlon.springlogindemo.service;

import com.scravlon.springlogindemo.dao.CarMakeRepository;
import com.scravlon.springlogindemo.models.CarMakeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMakePullerService {

    @Autowired
    CarMakeRepository carMakeRepository;

    public List<CarMakeModel> getAllCarMakes(){ return carMakeRepository.findAll();};
}
