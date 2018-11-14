package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String ci;
    private final String name;
    private final String last_name;
    private final String gender;
    private final int age;
    private final int numberCell;

    public Person(String ci, String name, String last_name, String gender, int age, int numberCell) {
        this.name = name;
        this.ci = ci;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.numberCell = numberCell;
        new GrowthList();
    }

    /**
     * method for get the ci
     * @return ci
     */
    public String getCi() {
        return ci;
    }

    /**
     * method for get the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *  method for get the age
     * @return ege
     */
    public int getAge() {
        return age;
    }

    /**
     * method for last name
     * @return last name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * method for gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *  method for numeber cell
     * @return numberCell
     */
    public int getNumberCell() {
        return numberCell;
    }
}
