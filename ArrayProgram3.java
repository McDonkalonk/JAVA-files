/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *ArrayProgram3
 * Craig Miller
 * 4/2/20
 */
import javax.swing.JOptionPane;
public class ArrayProgram3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String response = JOptionPane.showInputDialog(null, "Number of scores");
        int number = Integer.parseInt (response);
        int scores[] = new int[number];
        for (int a = 0; a < number; a++) {
            response=JOptionPane.showInputDialog(null, "Enter score " + (a + 1));
            scores[a] = Integer.parseInt(response);
        }
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            if (scores[i] > largest) {
                largest = scores[i];
            }
            if (scores[i] > smallest) {
                smallest = scores[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Sum: " + sum
        + "\nAverage: " + sum/scores.length
        + "\nLargest Score: " + largest
        + "\nSmallest Score: " + smallest);
    }
    
}
