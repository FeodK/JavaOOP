package Sem6.SRP;

public class EmploteeSalaryCal {
    private int baseSalary;

    public EmploteeSalaryCal(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double employeeSalaryCalculate(){
        return baseSalary * 1.5;
    }
}
