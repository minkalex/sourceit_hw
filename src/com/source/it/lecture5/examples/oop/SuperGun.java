package com.source.it.lecture5.examples.oop;

public class SuperGun extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("Shoot!!!!");
        System.out.println("Damage done 1000");
        loaded = false;
    }
}
