package com.source.it.lecture5.examples.oop;

public abstract class AbstractGun implements GunInterface {
    protected boolean loaded = false;

    @Override
    public void load() {
        if (!this.loaded) {
            this.loaded = true;
        }
    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public abstract void shoot();
}
