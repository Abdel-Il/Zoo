package com.ing.zoo.animals;

import com.ing.zoo.resources.Carnivore;
import com.ing.zoo.resources.PerformTrick;

import java.util.Random;

public class Cat extends Carnivore implements PerformTrick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Cat(String name) {
        this.name = name;
    }

    public void sayHello() {
        this.helloText = "meowww";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void eatMeat() {
        eatText = "nomnomnom meoww";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
