package Java.OOP.Lab4.packA;

/*
 * 65050252
 */

 public class Lab3EmpTmp {
    protected String name;
    protected int salary;
    protected int experience;

    public Lab3EmpTmp(String n, int exp, int sal) {
        this.name = n;
        this.experience = exp;
        this.salary = sal;
    }

    public Lab3EmpTmp(String n) {
        this.name = n;
    }

    public Lab3EmpTmp() {
    
    }

    public void setName(String name) {
    
    }

    public String getName() {
        return name;
    }

    public void setSalray(int newSalary) {
        this.salary = newSalary;
    }

    public int getSalray() {
        return salary;
    }

    public void setExperience(int exp) {
        this.experience = exp;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {
        return "I know java";
    }

    public void sayHi() {
        System.out.println("I am an Employee");
    }

}