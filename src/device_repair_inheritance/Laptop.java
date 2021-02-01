//THIS IS A SUBCLASS TO THE SUPERCLASS DEVICES:
//
//1.Add 'extends superclassname' to public class 
//2.Add the constructor using insert code
//3.Add getters and setters in the areas you want them from 


package device_repair_inheritance;

import java.util.ArrayList; 

//Setting the extends phrase and then adding the constructor to this: 
public class Laptop extends device {

    private ArrayList<Components> Components = new ArrayList<>(); 
    
    public Laptop(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes, Priority);
    }

    
    
    public ArrayList<Components> getComponents() {
        return Components;
    }

    public void setComponents(ArrayList<Components> Components) {
        this.Components = Components;
    }
    
    
    
    
    public void addComponents(Components components){
        Components.add(components); 
    }
    
    public void deleteComponent(int index){
        Components.remove(index); 
    }
    
    
    
    
    
    
    


    }
    
    
    
    

