package com.company;

public class Resctangle extends Figure {
    private int lenght;
    private int wight;
    private String name;

    public Resctangle(int lenght,int wight,String name) {
        super(name);
        this.lenght = lenght;
        this.wight = wight;
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (getLenght() + getWight());
    }

    @Override
    public void draw() {
        System.out.println("Прямоугольник выглядит тк: " + "?");
    }
}
