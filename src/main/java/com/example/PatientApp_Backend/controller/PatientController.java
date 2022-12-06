package com.example.PatientApp_Backend.controller;


import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {


    @PostMapping("/add")
    public String AddPatient(){
        return "patient added";
    }







}
