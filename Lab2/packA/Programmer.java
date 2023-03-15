package Java.OOP.Lab2.packA;

/*
 * 65050252
 */

 public class Programmer {
    private String name;
    protected int salary;
    private int experience;

    public Programmer(String n, int exp, int sal) {
        this.name = n;
        this.salary = sal;
        this.experience = exp;
    }

    public Programmer(String n, int exp) {
        this.name = n;
        this.experience = exp;
    }

    public Programmer() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setExperience(int exp) {
        this.experience = exp;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {
        return "Programmer [name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
    }

    public void sayHi() {
        System.out.println("hi from " + name);
    }

}
