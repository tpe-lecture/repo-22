package tpe.oo.factory.figuren;
import java.util.Random;

import tpe.oo.factory.GameBoard;
/**
 * neu.
 * @author User
 *
 */
public class FigurenFactory {
    /**
     *
     * @param g GameBoard
     * @return figur
     */
    public Figur createFigur(GameBoard g) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        switch (random % 3) {
            case 0 : return new Lady(g);
            case 1 : return new Ninja(g);
            case 2 : return new Wizard(g);
            default : return new Wizard(g);
        }
    }
}
