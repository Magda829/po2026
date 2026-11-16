package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;

import java.util.Arrays;
import java.util.Random;

public class Zoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.tablica();
        zoo.opis();
        System.out.println(zoo.suma());
    }

    Animal[] animals = new Animal[100];

    public void tablica() {
        Random random = new Random();
        Arrays.setAll(animals, i -> switch (random.nextInt(3)) {
            default -> new Dog("Dog" + i);
            case 1 -> new Parrot("Parrot" + i);
            case 0 -> new Snake("Snake" + i);
        });
    }

    public void opis() {
        for(Animal animal : animals) {
            int legs = animal.getLegs();
            String description = animal.getDescription();
            System.out.println(description);
        }
    }

    public int suma() {
        int nogi = 0;
        for (Animal animal : animals) {
            nogi = nogi + animal.getLegs();
        }
        return nogi;
    }
}
