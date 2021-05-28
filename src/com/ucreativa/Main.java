package com.ucreativa;
import com.ucreativa.poc.Valery;
import com.ucreativa.poc.Mario;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hola Clase");
        Valery yo = new Valery("Hi");

        String saludo = "Buenas Noches";

        Mario father = new Mario(saludo);

        father.setCumple();
        int age = father.getCumple();
        String hobby = father.getHobby();

        System.out.println("Feliz Cumple " + age);
        System.out.println("I love " + hobby);


    }
}
