package Java.OOP.Lab1;

import java.util.ArrayList;

/*
 * 65050252 ³Ñª¾Å
 */
class Lab1Coder {
    private String name;
    int experience;
    private ArrayList<String> languages = new ArrayList<>();

    Lab1Coder() {
    }

    Lab1Coder(String n, int exp) {
        this.name = n;
        this.experience = exp;
    }

    Lab1Coder(String n) {
        this.name = n;
        this.experience = 0;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setExperience(int exp) {
        this.experience = exp;
    }

    int getExperience() {
        return experience;
    }

    void setLanguages(String... lang) {
        for (String mem : lang) {
            languages.add(mem);
        }
    }

    ArrayList<String> getLanguages() {
        return languages;
    }

    @Override
    public String toString() {
        String s = this.name + "(" + this.experience + ") knows";
        for (String temp : this.languages) {
            s += " " + temp;
        }
        return s;
    }

    ArrayList<String> findCommonLanguages(Lab1Coder other) {
        ArrayList<String> tempList = new ArrayList<>();
        tempList.addAll(this.languages);
        tempList.retainAll(other.languages);
        if (tempList.isEmpty()) {
            tempList.add("none");
            return tempList;
        } else {
            return tempList;
        }
    }
}
