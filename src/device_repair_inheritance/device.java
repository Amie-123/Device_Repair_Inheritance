//THE SUPERCLASS OF DEVICE REPAIR INHERITENCE:
//
//1.Create your protected variables
//2.Add the constructors by inserting code  
//3.Add getter by inserting code
//4.Add setter by inserting code 
//5. Between constructor and getter, make a toString method like seen below: 

package device_repair_inheritance;

//You want to make all the varibales PROTECTED in the superclass:

public class device {
    //Creating protected variables tobe acsessed in subclasses: 
    protected String IdentificationCode; 
    protected String MakeAndModel;
    protected String Owner; 
    protected String ProblemDescription; 
    protected String RepairNotes; 
    protected int Priority; 
    
    
    //Adding the constructor: --making the object
    public device(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.Owner = Owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
        this.Priority = Priority; 
    }
    
    
    public String toString(){
        return IdentificationCode + ", " +  MakeAndModel + ", " + Owner + ", " + ProblemDescription + ", " + RepairNotes + ", " + Priority + ", "; 
    }
    
    
    //Adding the getter code:
    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }
    
    public int getPriority(){
        return Priority;
    }
    
    
    
    //Adding the setter code: 
    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }
    
    public void setPriority(int Priority){
        this.Priority = Priority;
    }
    
    
    
}
