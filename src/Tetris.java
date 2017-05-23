import javax.swing.*;
import java.awt.*;

/**
 * Created by ronald on 17/12/16.
 */
public class Tetris extends JFrame {

    JLabel statusbar;

    public Tetris(){

        statusbar = new JLabel(" 0 ");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public JLabel getStatusbar(){
        return statusbar;
    }

    public static void main(String[] args) {
        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}
