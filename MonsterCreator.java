/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monstercreator;

/**
 *
 * @author cj
 */
public class MonsterCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassMonster monster1 = new ClassMonster("Lochness", 600, 100, "Sea");
        ClassMonster monster2 = new ClassMonster("Swamp Thing", 300, 8, "Swamp");
        ClassMonster monster3 = new ClassMonster("Dracula", 170, 6, "Undead");
        
        System.out.println("Name: " + monster1.getName());
        System.out.println("Weight: " + monster1.getWeight()+"lbs.");
        System.out.println("Height: " + monster1.getHeight()+"ft");
        System.out.println("Classification: " + monster1.getClassification());
        System.out.println("Name: " + monster2.getName());
        System.out.println("Weight: " + monster2.getWeight()+"lbs.");
        System.out.println("Height: " + monster2.getHeight()+"ft");
        System.out.println("Classification: " + monster2.getClassification());
        System.out.println("Name: " + monster3.getName());
        System.out.println("Weight: " + monster3.getWeight()+"lbs.");
        System.out.println("Height: " + monster3.getHeight()+"ft");
        System.out.println("Classification: " + monster3.getClassification());
        System.out.println("\n");
        
        System.out.println(monster3.compare(monster1));
        System.out.println(monster3.compare(monster2));
        
        System.out.println("\n");
    }
    
}
