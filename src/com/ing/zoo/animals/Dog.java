package com.ing.zoo.animals;

import com.ing.zoo.resources.Carnivore;
import com.ing.zoo.resources.PerformTrick;

import java.util.Random;

public class Dog extends Carnivore implements PerformTrick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void sayHello() {
        helloText = "bark barkk";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eatMeat() {

    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls over";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
