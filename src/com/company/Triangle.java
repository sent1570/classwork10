package com.company;

public class Triangle extends Figure{
    private int firstside;
    private int secondside;
    private int thirdside;
    private String name;

    public Triangle(int firstside,int secondside,int thirdside,String name) {
        super(name);
        this.firstside = firstside;
        this.secondside = secondside;
        this.thirdside = thirdside;
        this.name = name;
    }

    public int getFirstside() {
        return firstside;
    }

    public void setFirstside(int firstside) {
        this.firstside = firstside;
    }

    public int getThirdside() {
        return thirdside;
    }

    public void setThirdside(int thirdside) {
        this.thirdside = thirdside;
    }

    public int getSecondside() {
        return secondside;
    }

    public void setSecondside(int secondside) {
        this.secondside = secondside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int calculatePerimeter() {
        return getFirstside() + getSecondside() + getThirdside();
    }

    @Override
    public void draw() {
        System.out.println("Треугольник выглядит так: " + "?");
    }
}
