package Sem6.SRP;


public class Employee {
    private String name;
    private String occupation;



    public Employee(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    
}