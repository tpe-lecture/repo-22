package tpe.oo.factory.figuren;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;

/**
 * Lady.
 */
public class Lady extends Figur {

    /**
     * Neuer Figur anlegen.
     *
     * @param board das Spielfeld
     */
    protected Lady(Board board) {
        super(board, new AnimatedImage(50, 8, "assets/lady.png"));
    }
    /**
     *
     * @param board neu
     * @param speed neu
     */
    protected Lady(Board board, int speed) {
        super(board, new AnimatedImage(50, 8, "assets/lady.png"), speed);
    }
}
