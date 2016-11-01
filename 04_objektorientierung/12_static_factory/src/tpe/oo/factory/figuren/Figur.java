package tpe.oo.factory.figuren;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Eine Figur, die an einer zufälligen Stelle erscheint.
 */
public abstract class Figur extends AnimatedSprite {
    /**
     *
     * @param board neu
     * @param asset neu
     */
    Figur(Board board, AnimatedImage asset) {
        this(board, asset, 1);
    }
    int speed;

    /** Geschwindigkeit des X-Richtung. */


    /**
     * Neuer Figur anlegen.
     *
     * @param board das Spielfeld
     * @param asset Bild für die Figur
     * @param speedset neu
     */
    Figur(Board board, AnimatedImage asset, int speedset) {
        super(board, new Point(new Random().nextInt(board.getWidth() * 2),
                new Random().nextInt(300)),
                BoundaryPolicy.JUMP_BACK,
                asset);
        this.speed = speedset;

        velocity.setVelocity(Direction.WEST, speed);
        setBounds(new Rectangle(0, 0,
                board.getWidth() + 400, board.getHeight()));
    }
}
