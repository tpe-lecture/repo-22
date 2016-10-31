package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController, AnalogController {
    DigitalController dc = new DigitalControllerImpl();
    AnalogController ac = new AnalogControllerImpl();

    @Override
    public void up() {
        dc.up();
    }

    @Override
    public void down() {
        dc.down();
        }

    @Override
    public void left() {
        dc.left();
        }

    @Override
    public void right() {
        dc.right();
        }


    @Override
    public void up(double percentage) {
        ac.up(percentage);
    }

    @Override
    public void down(double percentage) {
        ac.down(percentage);
    }

    @Override
    public void left(double percentage) {
        ac.left(percentage);
    }

    @Override
    public void right(double percentage) {
        ac.right(percentage);
    }

    @Override
    public Point getPosition() {
        Point pDc = dc.getPosition();
        Point pAc = ac.getPosition();
        return new Point ((int) pAc.getX() + (int) pDc.getX() ,(int)pAc.getY() + (int) pDc.getY());
    }
}
