/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Craig Miller
 * Magic 8 Ball
 * 3/4/20
 */
import javax.swing.JOptionPane;
public class magicBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randNum=(int)(Math.random()*12+1);
        JOptionPane.showInputDialog(null,"ask a question any question");
        String quote=null;
        switch (randNum) {
            case 1:
                quote="only time will tell";
                break;
            case 2:
                quote="need to recalculate, ask again later";
                break;
            case 3: 
                quote="if pigs fly";
                break;
            case 4: 
                quote="my sources say do not ask that question";
                break;
            case 5:
                quote="the future says yes";
                break;
            case 6:
                quote="did you really just ask me that?";
                break;
            case 7:
                quote="that will never be possible, ever";
                break;
            case 8:
                quote="doesn't look like it";
                break;
            case 9:
                quote="not in any universe";
                break;
            case 10:
                quote="yes yes a million times yes";
                break;
            case 11:
                quote="is the sky blue?";
                break;
            case 12:
                quote="of course";
                break;
        }
        JOptionPane.showMessageDialog(null,quote);
    }
    
}
