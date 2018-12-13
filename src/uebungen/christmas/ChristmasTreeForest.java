package uebungen.christmas;


import ch.aplu.turtle.Turtle;

import java.awt.*;

public class ChristmasTreeForest {

    public static void main(String[] args) {

        Turtle forestRanger = new Turtle();
        forestRanger.speed(5000.0);

        for(int i = 0; i <= 50; i++){
            christmasTree(forestRanger, getRandomNumberBetween(-190, 190), getRandomNumberBetween(-190, 190));
        }

        forestRanger.hideTurtle();
    }




    private static void christmasTree(Turtle turtle, int x, int y) {
        int size = getRandomNumberBetween(3,10);
        if(y <= -66){
            size = getRandomNumberBetween(10,15);
        }else if(y > -66 && y < 66){
            size = getRandomNumberBetween(5,9);
        }else {
            size = getRandomNumberBetween(2,4);
        }

        System.out.println("Paint Tree at (" + x + " / " + y + ") with size " + size);
        turtle.setPos(x, y);
        Color darkGreen = new Color(0x0,0x91,0x0);

        turtle.setPenColor(darkGreen);

        turtle.right(90);
        turtle.forward(size);
        turtle.left(90);
        turtle.fd(size);
        turtle.right(90);
        turtle.fd(2*size);
        turtle.left(135);
        turtle.fd(Math.sqrt(2*2*size*2*size));
        turtle.right(135);
        turtle.fd(size);
        turtle.left(135);
        turtle.fd(Math.sqrt(2*2*size*2*size));

        turtle.left(90);
        turtle.fd(Math.sqrt(2*2*size*2*size));
        turtle.left(135);
        turtle.fd(size);
        turtle.right(135);
        turtle.fd(Math.sqrt(2*2*size*2*size));
        turtle.left(135);
        turtle.fd(2*size);
        turtle.right(90);
        turtle.fd(size);

        turtle.left(90);
        turtle.fd(size);
        turtle.left(90);

    }

    private static int getRandomNumberBetween(int start, int end) {
        return (int)((end - start) * Math.random()) + start;
    }
}
