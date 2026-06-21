package com.example.demo.model;

public class Resume {

    private String name;
    private String skills;

    public Resume() {
    }

    public Resume(String name,
                  String skills) {

        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}