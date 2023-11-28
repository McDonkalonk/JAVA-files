/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *bottles of soda
 * Craig Miller
 * 3/26/2020
 */
public class BottlesOfSoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int n = 99; n > 0; n--) {
        System.out.println(n + " bottles of soda on the wall, "
        + n + "99 bottles of soda."
        + "\nTake one down and pass it around, "
        + (n-1) + "98 bottles of soda on the wall. \n");
    }
    System.out.println("Go to the store and buy some more," +
            "\n99 bottles of soda on the wall. \n");
    }
}

