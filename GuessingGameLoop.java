
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Guessing Game Loop
 * Craig Miller
 * 3/26/2020
 */
public class GuessingGameLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int computerNumber = (int) (Math.random() * 10 + 1);
        System.out.println("The correct guess would be " + computerNumber);
        int userAnswer = 0;
        while (computerNumber != userAnswer) {
        String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 10");
        userAnswer = Integer.parseInt(response);
        String result=null;
        if (userAnswer <= 0 || userAnswer > 10) {
            result="Invalid guess";
        } else if (userAnswer == computerNumber) {
            result="Correct";
        } else {
            result="Incorrect";
        }
        JOptionPane.showMessageDialog(null, result);
        }
    }
   
    
}
