package Java.OOP.Lab4.packA;

import java.util.ArrayList;

/*
 * 65050252
 */

public class Programmer extends Employee {

    private ArrayList<String> skills = new ArrayList<>();

    public Programmer(String n, int exp, int sal) {
        this.name = n;
        this.experience = exp;
        this.salary = sal;
    }

    @Override
    public void sayHi() {
        System.out.println("hi from " + name);
    }

    public String coding() {
        return "I love java";
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void addSkills(String newSkill) {
        this.skills.add(newSkill);
    }

}
