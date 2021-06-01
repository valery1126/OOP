package com.ucreativa.familia;

public class Mario {

    private int age;
    private String hobby;

    public Mario(String saludo){
        this.age = 70;
        this.hobby = "Gardening";
        System.out.println(saludo);
    }

    public void setCumple(){
        this.age = this.age + 1;
    }

    public int getCumple(){
        return this.age;
    }

    public String getHobby() {
        return hobby;
    }


}
