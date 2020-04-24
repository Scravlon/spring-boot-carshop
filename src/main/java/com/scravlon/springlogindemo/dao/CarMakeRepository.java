package com.scravlon.springlogindemo.dao;

import com.scravlon.springlogindemo.models.CarMakeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMakeRepository extends JpaRepository<CarMakeModel,Integer> {
}
