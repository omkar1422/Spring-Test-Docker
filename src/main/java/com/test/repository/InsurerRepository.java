package com.test.repository;

import com.test.entity.Insurer;
import org.springframework.data.repository.CrudRepository;

public interface InsurerRepository extends CrudRepository<Insurer, Integer> {
}
