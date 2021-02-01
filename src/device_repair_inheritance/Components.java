//This is just a seperate class not related to the superclass 
//
//1.Create variables 
//2.Add constructors using insert code
//3.Add getters and setters using insert code 

package device_repair_inheritance;


public class Components {
    
    private String name; 
    private double cost; 

    public Components(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
    
    
    
    
    
}
