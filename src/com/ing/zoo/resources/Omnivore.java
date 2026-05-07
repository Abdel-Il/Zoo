package com.ing.zoo.resources;

public abstract class Omnivore implements Animal{

    @Override
    public abstract void sayHello();

    public abstract void eatLeaves();
    public abstract void eatMeat();
}
