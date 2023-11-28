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
public class ClassMonster {
    private String name = null;
    private double weight = 0;
    private double height = 0;
    private String classification = null;
    //constructor
   public ClassMonster(String newName, double newWeight, double newHeight, String newClassification ) {
       setName(newName);
       setWeight(newWeight);
       setHeight(newHeight);
       setClassification(newClassification);
   }
   //setter method name
    public final void setName(String newName) {
        this.name = newName;
    }
    //setter method classification
    public final void setClassification(String newClassification) {
        this.classification = newClassification;
    }
    //setter method weight
    public final void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight cannot be negative or zero.");
        }
    }
    //setter method height
    public final void setHeight(double newHeight) {
        if (newHeight > 0) {
            this.height = newHeight;
        } else {
            System.out.println("Height cannot be negative or zero.");
        }
    }
    public String getName() {
        return this.name;
    }
    public double getWeight() {
        return this.weight;
    }
    public double getHeight() {
        return this.height;
    }
    public String getClassification() {
        return this.classification;
    }
    public String compare(ClassMonster monsterCompare) {
        String message = null;
        if(monsterCompare.height < this.height) {
           
        } else if(monsterCompare.height > this.height) {
            message = this.name + " is the shortest ";
        
    }
        
        return message;
    }
    
}
