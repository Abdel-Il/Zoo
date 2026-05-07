package com.ing.zoo.animals;

import com.ing.zoo.resources.Carnivore;

public class Lion extends Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
