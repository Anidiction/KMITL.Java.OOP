package Java.OOP.Lab4.packA;

/*
 * 65050252
 */

 public class Salesperson extends Employee implements SalesRoles {

    private int target;

    public void sayHi() {
        System.out.println("Hi!");
    }

    public void setSalary() {
        this.salary *= salary;
    }

    public void setSalary(int incAmount) {
        this.salary += incAmount;
    }

    public String makeQuotation() {
        int randNum = (int) (Math.random() * 1000) + 1;
        return "Dear value customer, " + randNum + " is my best offer.";
    }
}
