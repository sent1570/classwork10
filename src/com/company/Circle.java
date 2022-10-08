package com.company;

public class Circle extends Figure{

    private  int radius;
    private String name;


    public Circle(int radius,String name) {
        super(name);
        this.radius = radius;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * getRadius());
    }

    @Override
    public void draw() {
        System.out.println("Круг выглядит так: " + "?");
    }
}
