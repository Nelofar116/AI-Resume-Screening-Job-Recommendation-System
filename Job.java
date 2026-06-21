package com.example.demo.model;

public class Job {

    private Long id;
    private String title;
    private String company;

    public Job() {
    }

    public Job(Long id, String title, String company) {
        this.id = id;
        this.title = title;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}