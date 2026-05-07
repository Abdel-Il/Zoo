package com.ing.zoo.animals;

import com.ing.zoo.resources.Herbivore;

public class Zebra extends Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
