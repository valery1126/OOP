package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.BufferedWriter;


public class FileRepository implements Reporsitory{

    private final String FILE_PATH = "db.txt";

    @Override
    public void save(Persona persona, String marca, Date fecha) {

        String texto = "";

            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));
            writer.append(texto);
            writer.close();

    }

    @Override
    public List<String> get() {
        return null;
    }
}
