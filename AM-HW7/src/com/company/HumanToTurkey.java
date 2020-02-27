package com.company;

public class HumanToTurkey implements Turkey {
    FlyingPerson flyingPerson;
    public HumanToTurkey(FlyingPerson flyingPerson)
    {
        this.flyingPerson = flyingPerson;
    }
    @Override
    public void gobble()
    {
        this.flyingPerson.speak();
    }
    @Override
    public void fly()
    {

        this.flyingPerson.fly();
    }
}



