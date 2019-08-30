package com.brainacad.security.dao;

import com.brainacad.security.entity.Bicycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicycleRepository extends CrudRepository<Bicycle, Long> {
}
