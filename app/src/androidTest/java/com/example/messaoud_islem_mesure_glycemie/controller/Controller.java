package com.example.messaoud_islem_mesure_glycemie.controller;

import com.example.messaoud_islem_mesure_glycemie.model.Patient;

public class Controller {
    private Patient patient;

    public Controller() {}
    public void createPatient(int age , boolean jeune , float  editext) {
        this.patient= new Patient(age,editext,jeune);
    }
    public void getResponse(){

        //return patient.calculer();
    }

}
