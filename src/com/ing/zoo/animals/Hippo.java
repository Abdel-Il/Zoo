package com.ing.zoo.animals;

import com.ing.zoo.resources.Herbivore;

public class Hippo extends Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
