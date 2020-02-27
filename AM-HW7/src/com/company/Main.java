package com.company;

public class Main {

    public static void main(String[] args) {

    //code of class
	MallardDuck timmy = new MallardDuck();
	WildTurkey bobby = new WildTurkey();
	Duck bobbyD = new TurkeyAdapter(bobby);
	Duck bobbina = new TurkeyClassAdapter();

    //HW//

	PersonWithJetpack someone = new PersonWithJetpack();

	//adapt"FLying person" interface and "PersonWithJetpack" class to make a turkey
	Turkey humanToturkey = new HumanToTurkey(someone);

	//second part of point 1 of HW, chain adapters to make a duck. using "HuamanToDuck" which extends "HumanToTurkey"
		// and implements Duck.
	Duck humanToduck =  new HumanToDuck(someone);

	//class code
	testDuck(timmy);
	testDuck(bobbyD);
	testDuck(bobbina);

	//human to turkey
	tesTurkey(humanToturkey);

	//human to duck from "humantoturkey" adapter
	testDuck(humanToduck);



    }

    public static void testDuck(Duck duck)
	{
		duck.fly();
		duck.quack();

	}

	public static void tesTurkey(Turkey turkey)
	{
		turkey.fly();
		turkey.gobble();

	}


}
