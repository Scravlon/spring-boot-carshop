package com.scravlon.springlogindemo.dao;

import com.scravlon.springlogindemo.models.CarListingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarListingRepository extends JpaRepository<CarListingModel, Integer> {

}
