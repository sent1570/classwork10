package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle(4,"Circle First");
    Resctangle resctangle = new Resctangle(3,4,"Resctangle First");
    Square square = new Square(6,"Square First");
    Triangle triangle = new Triangle(5,3,3,"Triangle First");
        Dog dog = new Dog("Sonny");
        Cat cat = new Cat("GG");
        Drawable[] drawable = {circle,resctangle,square,triangle,dog,cat};


        for (Drawable drawablevalue : drawable) {
            if (drawablevalue instanceof Figure) {
                System.out.println(((Figure) drawablevalue).getName());
                System.out.println(((Figure) drawablevalue).calculatePerimeter());
            }
            if (drawablevalue instanceof Animal) {
                System.out.println(((Animal) drawablevalue).getName());
                ((Animal) drawablevalue).callSound();
            }
            drawablevalue.draw();
        }
        }
        }



