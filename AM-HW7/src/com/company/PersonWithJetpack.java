package com.company;

public class PersonWithJetpack implements FlyingPerson {
    public void fly(){
        System.out.println("I am FLying with my jetpack");

    }
    @Override
    public void speak(){

        System.out.println("Hello I am human ");
    }

}
