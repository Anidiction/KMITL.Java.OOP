package Java.OOP.Lab3.packA;

/*
 * 65050252
 */

 public class Accountant extends EmpTmp {
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;

    public Accountant(String name, int superExp, int experience, int sal, String talent) {
        super(name, superExp, sal);
        this.experience = experience;
        this.specialty = talent;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setAccountExperience(int exp) {
        this.experience = exp;
    }

    public int getAccountExperience() {
        return experience;
    }

    public String tellProfit() {
        int randNum = (int) (Math.random() * 1000) + 1;
        return companyName + "'s profit is " + randNum + ". My salary is " + salary;
    }

    public String toString() {
        return "Accountant [experience=" + experience + ", specialty=" + specialty + "]";
    }

    @Override
    public void sayHi() {
        System.out.println(getName() + " says hello");
    }

    public static String tellMyRole() {
        return "I am an accountant at %s" + companyName;
    }
}
