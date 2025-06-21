
//William Stearns
//6-14-25
//CSD402
//This program simulates a rock paper scissors game with the user.
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        while (true) {
            byte userChoice, compChoice;
            showMessageDialog(null, "Rock, Paper, Scissors Shoot");
            userChoice = userInput();
            compChoice = compDecide();
            decideWinner(compChoice, userChoice);
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
            if (answer == JOptionPane.YES_OPTION) {
                showMessageDialog(null, "That's the sprit!");
            }
            else {
                showMessageDialog(null, "Okay, Goodbye");
                break;


            }
        }
    }
    static byte userInput() {
        byte b1;
        String[] options = { "Rock", "Paper", "Scissors" };
        int userPick = JOptionPane.showOptionDialog(null, "Which do you choose?","Rock Paper Scissors", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (userPick) {
            case 0:
                showMessageDialog(null, "You chose Rock");
                b1 = 1;
                break;
            case 1:
                showMessageDialog(null, "You chose Paper");
                b1 = 2;
                break;
            case 2:
                showMessageDialog(null, "You chose Scissors");
                b1 = 3;
                break;
            default:
                b1 = 0;
                break;
            }
        return b1;
        }
    static void decideWinner(byte compChoice , byte userChoice) {
        switch ((compChoice - userChoice) * (compChoice + userChoice)) {
            case 0:
                showMessageDialog(null, "You both made the same choice. It's a tie!");
                break;
            case -3:
            case -5:
            case 8:
                showMessageDialog(null, "Congrats you win");
                break;
            case 3:
            case 5:
            case -8:
                showMessageDialog(null, "Sorry, you lost.");
                break;
        }
    }
    static byte compDecide() {
        byte b2 = (byte) (new Random().nextInt(3) + 1);
            switch (b2) {
                case 1:
                    showMessageDialog(null, "Your opponent chose Rock");
                    break;
                case 2:
                    showMessageDialog(null, "Your opponent chose Paper");
                    break;
                case 3:
                    showMessageDialog(null, "Your opponent chose Scissors");
                    break;
                }
        return b2;
        }
}