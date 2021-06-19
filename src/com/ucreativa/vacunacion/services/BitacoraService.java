package com.ucreativa.vacunacion.services;


import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.ui.ErrorEnEdadException;


import java.io.IOException;
import java.util.Date;
import java.util.List;


public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String txtEdad,
                     Boolean riesgo, Boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca) throws IOException, ErrorEnEdadException {
        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException x) {
            throw new ErrorEnEdadException(txtEdad);
        }
        Persona persona;
        if (isAmigo){
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        }else {
            //persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
                if (relacion.equals("Hermano")) {
                    persona = new Familiar(nombre, edad, riesgo, parentesco);
                } else {
                    persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
                }
        }
        this.repository.save(persona, marca, new Date());
    }

    public List<String> get(){
        return this.repository.get();
    }


}
