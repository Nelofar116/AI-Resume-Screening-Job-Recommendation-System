package com.example.demo.model;

public class Recommendation {

    private String jobTitle;
    private String company;
    private String matchScore;

    public Recommendation() {
    }

    public Recommendation(String jobTitle,
                          String company,
                          String matchScore) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.matchScore = matchScore;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }
}