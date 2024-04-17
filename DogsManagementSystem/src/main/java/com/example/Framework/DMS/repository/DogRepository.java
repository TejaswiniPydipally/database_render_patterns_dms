package com.example.Framework.DMS.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Framework.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}

