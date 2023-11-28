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
public class Dog {
    private String name = null;
    private double weight = 0;
    
   public Dog(String newName, double newWeight) {
       setName(newName);
       setWeight(newWeight);
   }
    
    public final void setName(String newName) {
        this.name = newName;
    }
    
    public final void setWeight(double newWeight) {
        if (newWeight > 0){
        this.weight = newWeight;
    } else {
    System.out.println("Weight cannot be negative or zero.");
}
}
public String getName() {
    return this.name;
}
public Double getWeight() {
    return this.weight;
}

public String compare(Dog dogCompare) {
    String message = null;
    if(dogCompare.weight > this.weight) {
        message = dogCompare.name + " weighs more than " + this.name;
    } else if (dogCompare.weight < this.weight){
        message = this.name + " weighs more than " + dogCompare.name;
    }else {
        message = this.name + " weights equal to " + dogCompare.name;
    }
    return message;
}
}

