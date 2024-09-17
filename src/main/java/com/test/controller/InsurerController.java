package com.test.controller;

import com.test.entity.Insurer;
import com.test.service.InsurerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test/insurer")
public class InsurerController {

    @Autowired
    private InsurerService insurerService;

    @PostMapping
    public Insurer saveInsurer(@RequestBody Insurer insurer) {
        try{
            return insurerService.saveInsurer(insurer);
        }
        catch (Exception e) {
            System.err.println("An error occurred while saving the insurer: " + e.getMessage());
            throw e;
        }
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handleGeneralException(Exception ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "An unexpected error occurred: " + ex.getMessage());
        return errorResponse;
    }
}
