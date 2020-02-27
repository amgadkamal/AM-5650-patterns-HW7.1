package com.company;

public class HumanToDuck extends HumanToTurkey implements Duck {


    public HumanToDuck(FlyingPerson flyingPerson) {
        super(flyingPerson);
    }

    @Override
        public void quack(){
            gobble();
        }

        @Override
        public void fly()
        {

                super.fly();


        }

    }
