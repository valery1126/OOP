package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Date fecha = new Date();
        ArrayList<BitacoraVacunas> listBitacora = new ArrayList<>();

        Familiar fam1 = new Familiar("Maria", "205890255",50,false,"Madre");
        BitacoraVacunas bitacora1 = new BitacoraVacunas(fam1,"Astra", fecha);
        listBitacora.add(bitacora1);

        Familiar fam2 = new Familiar("Mario", "205890258",50,false,"Padre");
        BitacoraVacunas bitacora2 = new BitacoraVacunas(fam2,"Astra", fecha);
        listBitacora.add(bitacora2);

        Amigo ami1 = new Amigo("Mauricio", "205890258",50,false,"Amigo", "Mauricio Ramirez");
        BitacoraVacunas bitacora3 = new BitacoraVacunas(ami1,"Astra", fecha);
        listBitacora.add(bitacora3);


        for (BitacoraVacunas item : listBitacora){
            System.out.println(item.getPersona().getNombre() + "Vacunado la fecha: " + item.getFecha());
        }*/



        Scanner in = new Scanner(System.in);

        List<BitacoraVacunas> db = new ArrayList<>();
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

            db.add(new BitacoraVacunas(persona, marca, new Date()));

            System.out.println("Desea imprimir la lista (S/N)");
            String print = in.nextLine();
            if (print.equals("S")) {
                for (BitacoraVacunas item : db) {
                    System.out.println(item.getPersona().getNombre() + " fue vacunada el " + item.getFecha());
                }
            }


        }

    }
}
