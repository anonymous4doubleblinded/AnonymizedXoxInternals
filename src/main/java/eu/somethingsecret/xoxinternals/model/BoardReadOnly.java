package eu.somethingsecret.xoxinternals.model;

/**
 * Read Only board interface for Xox boards.
 *
 * @author Anonymous Researcher
 */
public interface BoardReadOnly {

    boolean isEmpty();

    boolean isFull();

    boolean isFree(int xPos, int yPos);

    int[][] getCells();

}
