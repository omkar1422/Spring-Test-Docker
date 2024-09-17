package com.test.service;

import com.test.entity.Insurer;
import com.test.repository.InsurerRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsurerService {

    @Autowired
    private InsurerRepository insurerRepository;

    public Insurer saveInsurer(Insurer insurer) {

        try{
            return insurerRepository.save(insurer);
        }
        catch (Exception e) {
            System.err.println("An error occurred while saving the insurer: " + e.getMessage());
            throw e;
        }
    }

}
