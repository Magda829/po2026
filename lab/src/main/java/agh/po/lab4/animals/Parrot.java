package agh.po.lab4.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }


    @Override
    public String getDescription() {
        return "Papuga " + name + " ma: " + legs + " nóg";
    }

    @Override
    public void makeSound() {
        System.out.println("Skra");
    }
}
