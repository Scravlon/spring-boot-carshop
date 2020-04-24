package com.scravlon.springlogindemo.dao;

import com.scravlon.springlogindemo.models.CarListingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarListingRepository extends JpaRepository<CarListingModel, Integer> {
    @Query(value = "SELECT * FROM carlists WHERE carmake=?1",  nativeQuery = true)
    List<CarListingModel> selectMake(String make);

}
