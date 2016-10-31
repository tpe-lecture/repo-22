package tpe.oo.ueberschreiben;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Spielfeld.
 */
@SuppressWarnings("serial")
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private Alien [] alienar;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);


        // Alien initialisieren
        alienar = new Alien[30];
        for(int i=0; i<alienar.length;i++){
            switch(i%4)
            {
            case 1: {
                    alienar[i]= new Alien(this, new Point(400 + new Random().nextInt(100)*50, 50 + new Random().nextInt(100)*50),Direction.NORTH);
                    break;
                   }
            case 2: {
                alienar[i]= new Alien(this, new Point(400 - new Random().nextInt(100)*50, 50 + new Random().nextInt(100)*50),Direction.SOUTHEAST);
                break;
               }
            case 3: {
                alienar[i]= new Alien(this, new Point(400 + new Random().nextInt(100)*50, 50 + new Random().nextInt(100)*50),Direction.SOUTH);
                break;
               }
            case 0: {
                alienar[i]= new Alien(this, new Point(400 - new Random().nextInt(100)*50, 50 + new Random().nextInt(100)*50),Direction.NORTHWEST);
                break;
               }
            }
            addMouseListener(alienar[i]);
        }
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        for(int i=0; i<alienar.length;i++){
            alienar[i].draw(g);
        }

    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        for(int i=0; i<alienar.length;i++){
            alienar[i].move();
        }
        return checktrue();
    }

    private boolean checktrue() {
        for(int i=0; i<alienar.length;i++){
            if (alienar[i].isVisible()){
                return true;
            }
        }
        return false;
    }
    @Override
    protected void drawGameOver(Graphics g) {
        writeText(g, 170, 200, "game over");
    }
}
