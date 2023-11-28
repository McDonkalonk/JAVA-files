
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Computing Tip Amount
 * Craig Miller
 * 2/19/2020
 * NetBeans 8.2
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class tipcalculator {

    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(null, "Enter the total bill");
    double bill = Double.parseDouble(input);
    input = JOptionPane.showInputDialog(null,"Enter the tip perentage as a decimal" + "(Example: 10% would be 0.1)");
    double percentage = Double.parseDouble(input);
    double tipAmount = bill * percentage;
    NumberFormat dollars = NumberFormat.getCurrencyInstance();
    JOptionPane.showMessageDialog(null, "Bill amount: " + dollars.format(bill) + "\nTip Percentage: " + percentage + "\nTip: " + dollars.format(tipAmount));
    }
    
}
