package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        List<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);

        List<Carnivore> carnivores = new ArrayList<>();
        carnivores.add(henk);
        carnivores.add(wally);

        List<Herbivore> herbivores = new ArrayList<>();
        herbivores.add(elsa);
        herbivores.add(marty);

        List<Omnivore> omnivores = new ArrayList<>();
        omnivores.add(dora);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        switch (input) {
            case "hello":
                if (input.split(" ")[1] != null)
                    for (Animal a : animals) {
                        a.sayHello();
                    } else {
                        for (Animal a : animals) {
                            if (a.getName().equals(input.split(" ")[1])) {
                                a.sayHello();
                            }
                        }
                }
                break;
            case "give leaves":
                for (Herbivore h : herbivores) {
                    h.eatLeaves();
                }
                for (Omnivore o : omnivores) {
                    o.eatLeaves();
                }
                break;
            case "give meat":
                for (Carnivore c : carnivores) {
                    c.eatMeat();
                }
                for (Omnivore o : omnivores) {
                    o.eatMeat();
                }
                break;
        }
    }
}
