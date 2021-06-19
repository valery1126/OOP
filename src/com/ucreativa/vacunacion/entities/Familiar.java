package com.ucreativa.vacunacion.entities;

public class Familiar extends Persona {

    private String parentesco;

    public Familiar(String nombre, String cedula, int edad, boolean riesgo, String parentesco) {
        super(nombre, cedula, edad, riesgo);
        this.parentesco = parentesco;
    }

    public Familiar(String nombre, int edad, boolean riesgo, String parentesco) {
        super(nombre, "N/A", edad, riesgo);
        this.parentesco = parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
}
