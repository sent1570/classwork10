package com.company;

public class Square extends Figure{
    private int oneside;
    private String name;

    public Square(int oneside,String name) {
        super(name);
        this.oneside = oneside;
        this.name = name;
    }

    public int getOneside() {
        return oneside;
    }

    public void setOneside(int oneside) {
        this.oneside = oneside;
    }

    @Override
    public int calculatePerimeter() {
        return getOneside() * 4;
    }

    @Override
    public void draw() {
        System.out.println("Квадрат выглядит так: " + "?");
    }
}
