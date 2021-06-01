package com.ucreativa;
import com.ucreativa.poc.Valery;
import com.ucreativa.poc.Mario;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    /*System.out.println("Hola Clase");
        Valery yo = new Valery("Hi");

        String saludo = "Buenas Noches";

        Mario father = new Mario(saludo);

        father.setCumple();
        int age = father.getCumple();
        String hobby = father.getHobby();

        System.out.println("Feliz Cumple " + age);
        System.out.println("I love " + hobby);*/

        Date fecha = new Date();
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




    }
}
