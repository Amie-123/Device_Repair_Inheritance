//THIS IS A CODE THAT USES INHERITANCE:
//
//With in inheritance there is subclasses and superclasses
//Subclasses obtain methods and variables from the super class
//There are diagrams which are used to show what the different classes are 
//Your subclass wants to be able to acsess your Superclass variables
//
//In the diagrams:
//+ = public variables 
//- = private variables 
//# = protected variables




//THIS IS THE MAIN PROJECT//CLASS:

package device_repair_inheritance;


public class Device_repair_inheritance {

    
    public static void main(String[] args) {
        device myNewDevice = new device("12345", "Lenovo 3" , "Julie", "Smashed Screen", "Not yet Started", 1);
        System.out.println(myNewDevice.toString()); 
        
        
    }
    
}
