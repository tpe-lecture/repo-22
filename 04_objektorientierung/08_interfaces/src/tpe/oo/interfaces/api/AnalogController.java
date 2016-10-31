package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController{

    void up(double percentage);

    void down(double percentage);

    void left(double percentage);

    void right(double percentage);

    Point getPosition();
}
