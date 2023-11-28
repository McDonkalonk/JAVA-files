/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Craig Miller
 * 4/27/20
 * Jdk 8.2
 * This program will calculate BMI with a functional method
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class BodyMassIndexCalc {
    public static void main(String[] args) {
        // TODO code application logic here
        String response;
        response = JOptionPane.showInputDialog (null, 
                "Enter your height in inches");
        double height = Double.parseDouble (response);
        response = JOptionPane.showInputDialog (null,
                "Enter your weight in pounds");
        double weight = Double.parseDouble (response);
        double bmi = calculateBMI (height, weight);
        DecimalFormat pattern = new DecimalFormat("###.00");
        JOptionPane.showMessageDialog(null, "Height: " + height + 
                "\nWeight: " + weight +
                "\nBMI: " + pattern.format(bmi));
    }
    public static double calculateBMI (double height, double weight) {
        return (weight*703)/(height*height);
    }
}
