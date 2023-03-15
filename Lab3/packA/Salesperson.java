package Java.OOP.Lab3.packA;

/*
 * 65050252
 */

 public class Salesperson extends EmpTmp {

    private int target;

    public Salesperson(String n, int exp, int sal, int assignedTarget) {
        super(n, exp, sal);
        this.target = assignedTarget;
    }

    public Salesperson(String n, int exp) {

    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTarget() {
        return target;
    }

    public void setSalary() {
        this.salary *= salary;
    }

    public void setSalary(int incresedAmount) {
        this.salary += incresedAmount;
    }

    public String makeQuotation() {
        int randNum = (int) (Math.random() * 1000) + 1;
        return "Dear value customer, " + randNum + " is my best offer.";
    }

    public String toString() {
        return "Salesperson [target=" + target + " " + super.toString() + " ]";
    }
}
