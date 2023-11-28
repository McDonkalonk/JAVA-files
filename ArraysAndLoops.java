/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Arrays and Loops Lab 6
 * Craig Miller
 *4/2/20
 */
import javax.swing.JOptionPane;
public class ArraysAndLoops {

    public static void main(String[] args) {
        // TODO code application logic here
       String response = JOptionPane.showInputDialog(null, "Number of grades:");
        int number = Integer.parseInt(response);
        int scores[] = new int[number];
        for (int a = 0; a < number; a++) {
            response=JOptionPane.showInputDialog(null, "Enter grades " + (a + 1));
            scores[a] = Integer.parseInt(response);
        }
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i ++) {
        sum = sum + scores[i];
        if (scores[i] > largest) {
            largest = scores[i];
        }
        if (scores[i] < smallest) {
            smallest = scores[i];
        }
        }
     
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        for (int s = 0; s < scores.length; s ++) {
        if (scores[s] >= 90){
            ++A;}
        else if (scores[s] >= 80) {
            ++B;}
        else if (scores[s] >= 70) {
            ++C;}
        else if (scores[s] >= 60) {
            ++D;}
        else if (scores[s] >= 0) {
            ++F;}
        }
    
    
    JOptionPane.showMessageDialog(null, "Sum: " + sum
            + "\nAverage: " + sum/scores.length
            + "\nLargest Number: " + largest
            + "\nSmallest Number: " + smallest
            + "\nNumber of A's: " + A
            + "\nNumber of B's: " + B
            + "\nNumber of C's: " + C
            + "\nNumber of D's: " + D
            + "\nNumber of F's: " + F);
    }
}
