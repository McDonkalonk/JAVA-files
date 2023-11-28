import java.io.*;
import java.util.*;

public class OneDLab {
   public static void main(String[] args){
      char[] alphabet = new char[26];

      char letter = 'a';
      for (int i = 0; i<alphabet.length; i++){
         alphabet[i] = letter++;
      }

      System.out.println("The alphabet");
      for(char l: alphabet){
         System.out.print(l + " ");
      }
      System.out.println();
      
      System.out.println("The alphabet is reverse");
      for(int i=alphabet.length-1; i>= 0; i--){
         System.out.print(alphabet[i] + " ");
      }
      
      System.out.println();
      
      System.out.println("The 10th character: " + alphabet[9]);
      
      System.out.println("The last character: " + alphabet[alphabet.length]);
      }
}