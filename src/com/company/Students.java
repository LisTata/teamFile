package com.company;

public class Students implements Comparable {

    private int group;
    private String name;
    private  int grade;

    public Students(int group, String name, int grade) {
        this.group = group;
        this.name = name;
        this.grade = grade;
    }

    public Students(int group, String name) {
        this.group = group;
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {

        return this.getName().compareTo(((Students)o).getName());
    }
}
