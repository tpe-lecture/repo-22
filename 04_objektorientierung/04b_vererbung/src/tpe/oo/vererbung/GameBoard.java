package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Direction;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {
// TODO: Von Board ableiten

    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien;

    /** Asteroid. */
    private Sprite asteroid;

    /** Hintergrundbild. */
    private Image background;

    private Sprite asteroidzwei;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
// TODO: Einkommentieren
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 600), Color.BLACK);

        // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background");


        // TODO: Alien und Asteroid anlegen und positionieren

        alien = new AlienSprite(this,new Point(200,500));
        asteroid = new Asteroid(this,new Point(50,500),2.0,Direction.NORTH);
        asteroidzwei = new Asteroid(this,new Point(-80,500), 0.3 ,Direction.WEST);

    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {
        // TODO: Alle Objekte zeichnen
        alien.draw(g);
        asteroid.draw(g);
        asteroidzwei.draw(g);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *      zurück gibt
     */
    public boolean updateGame() {

        // TODO: Die Objekte bewegen
        alien.move();
        asteroid.move();
        asteroidzwei.move();


// TODO: Einkommentieren
        if (((alien.intersects(asteroid) && alien.isActive()))||(alien.intersects(asteroidzwei) && alien.isActive())) {
            alien.explode();
        }

        return true;
    }
}
