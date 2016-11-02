package tpe.oo.factory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import tpe.oo.factory.figuren.Figur;
import tpe.oo.factory.figuren.FigurenFactory;


/**
 * Spielfeld.
 *
 */
public class GameBoard extends Board {

    /** Figur, die durch das Bild läuft. */
    private Figur[] figur = new Figur[40];
    FigurenFactory ff = new FigurenFactory();

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 400), Color.BLACK);

        // Figuren erzeugen
        for (int i = 0; i < figur.length; i++) {

            if (i % 3 == 0) {
                figur[i] = ff.createFigur(this);
            }
            else if (i % 3 == 1) {
                figur[i] = ff.createFigur(this);
            }
            else { // i % 3 == 2
                figur[i] = ff.createFigur(this);
            }
        }
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Figuren zeichnen
        for (AnimatedSprite animatedSprite : figur) {
            animatedSprite.draw(g, this);
        }
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        for (AnimatedSprite animatedSprite : figur) {
            animatedSprite.move();
        }
        return true;
    }
}
