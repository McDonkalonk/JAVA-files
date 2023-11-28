/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogcreator;

/**
 *Craig Miller
 * 4/30/20
 * Dog Creator
 */
public class DogCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog1 = new Dog("Texie", 25);
        Dog dog2 = new Dog("Juicy", 15);
        Dog dog3 = new Dog("Penny", 28);
        
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight()+"lbs.");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Weight: " + dog2.getWeight()+"lbs.");
        System.out.println("Name: " + dog3.getName());
        System.out.println("Weight: " + dog3.getWeight()+"lbs.");
        System.out.println("\n");
        
        System.out.println(dog1.compare(dog2));
        System.out.println(dog1.compare(dog3));
        System.out.println(dog2.compare(dog3));
        System.out.println("\n");
        
        dog1.setWeight(28);
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight()+"lbs.");
        System.out.println(dog1.compare(dog3));
    }
    
}
