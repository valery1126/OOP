package com.ucreativa.poc;

public class Mario {

    private int age;
    private String hobby;

    public Mario(String saludo){
        this.age = 70;
        System.out.println(saludo);
    }

    public void setCumple(){
        this.age = this.age + 1;
    }

    public int getCumple(){
        return this.age;
    }




}
