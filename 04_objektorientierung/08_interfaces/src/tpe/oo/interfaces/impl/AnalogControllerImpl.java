package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {
    private Point position = new Point(0, 0);
    double x;
    double y;

    @Override
    public void up(double percentage) {
        System.out.println("up");
        y += percentage*-1;
        System.out.println("x: "+ x+ ", y: "+ y);
    }

    @Override
    public void down(double percentage) {
        System.out.println("down");
        y += percentage;
        System.out.println("x: "+ x+ ", y: "+ y);
    }

    @Override
    public void left(double percentage) {
        System.out.println("left");
        x += percentage*-1;
        System.out.println("x: "+ x+ ", y: "+ y);
    }

    @Override
    public void right(double percentage) {
        System.out.println("right");
        x += percentage;
        System.out.println("x: "+ x+ ", y: "+ y);
    }

    @Override
    public Point getPosition() {
        position.setLocation((int)x,(int)y);
        System.out.println("---------return   x: "+(int)x + ", y: "+(int)y);
        return (Point) position.clone();
    }

}
