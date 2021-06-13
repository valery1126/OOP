package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.repositories.InMemoryRepository;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());
        String nombre, cedula, edad, riesgo, isAmigo, relacion = "",
                facebook = "", parentesco = "", marca, print;
        boolean seguir = true;
        while (seguir) {
            System.out.println("Nombre:");
            nombre = in.nextLine();
            System.out.println("Cedula:");
            cedula = in.nextLine();
            System.out.println("Edad:");
            edad = in.nextLine();
            System.out.println("Riesgo(S/N):");
            riesgo = in.nextLine();
            System.out.println("Amigo(A)/Familiar(F):");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")) {
                System.out.println("Relacion:");
                relacion = in.nextLine();
                System.out.println("Facebook:");
                facebook = in.nextLine();
            } else {
                System.out.println("Parentesco:");
                parentesco = in.nextLine();
            }
            System.out.println("Vacuna -- Marca:");
            marca = in.nextLine();
            service.save(nombre, cedula, edad, riesgo, isAmigo, relacion,
                    facebook, parentesco, marca);
            System.out.println("Quiere imprimir Lista (S)");
            print = in.nextLine();
            if (print.equals("S")) {
                for (String item : service.get()) {
                    System.out.println(item);
                }
            }
            System.out.println("Continuar? (Default 'S')");
            seguir = !in.nextLine().equals("N");
        } // While

    }
}
