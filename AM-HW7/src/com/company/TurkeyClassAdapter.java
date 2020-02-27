package com.company;

public class TurkeyClassAdapter extends WildTurkey implements Duck {
    @Override
    public void quack(){
        gobble();
    }

    @Override
    public void fly()
    {
        for (int i=0; i<3 ; i++)
            super.fly();


    }


}
