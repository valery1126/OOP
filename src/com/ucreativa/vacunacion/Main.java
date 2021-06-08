package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.InMemoryRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        InMemoryRepository repo = new InMemoryRepository();
        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;
        Persona persona;

        while (true) {

            System.out.println("Nombre");
            nombre = in.nextLine();
            System.out.println("Cedula");
            cedula = in.nextLine();
            System.out.println("Edad");
            edad = in.nextLine();
            System.out.println("Riesgo (S/N)");
            riesgo = in.nextLine();

            System.out.println("Amigo(A) / Familiar(F)");
            isAmigo = in.nextLine();

            if (isAmigo.equals("A")) {

                System.out.println("Relacion");
                relacion = in.nextLine();

                System.out.println("Facebook");
                facebook = in.nextLine();
                //Se crea persona de tipo Amigo
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);


            } else {
                System.out.println("Parentesco");
                parentesco = in.nextLine();
                // Se crea persona de tipo familia
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);

            }

            System.out.println("Vacuna (Marca):");
            marca = in.nextLine();

            repo.save(persona, marca, new Date());

            System.out.println("Desea imprimir la lista (S/N)");
            String print = in.nextLine();
            if (print.equals("S")) {
                for (String item : repo.get()) {
                    System.out.println(item);
                }
            }


        }

    }
}
