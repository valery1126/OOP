package com.ucreativa.vacunacion.entities;

import com.ucreativa.vacunacion.services.ContadorRiesgo;

public class Persona {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;

    public Persona(String nombre, String cedula, int edad, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
        if (riesgo){
            ContadorRiesgo.getInstance().SumarRiesgo();
        }
    }


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }

    public boolean getRiesgo() {
        return riesgo;
    }

}
