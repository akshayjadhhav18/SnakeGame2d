import javax.swing.*;
//build basic UI
//paint component and loading images
//locate apple
//snake dynamics
//controlling snake
//game over
//submission
public class SnakeGame extends JFrame {

    Board board;

    SnakeGame(){
        board=new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }


    public static void main(String args[]){
        SnakeGame snakeGame=new SnakeGame();

    }
}
