package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Кошка выглядит так: " + "\uD83D\uDC31");
    }

    @Override
    public void callSound() {
        System.out.println("Мяу");
    }
}
