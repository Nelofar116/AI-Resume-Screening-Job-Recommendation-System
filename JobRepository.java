package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Job;

@Repository
public class JobRepository {

    private List<Job> jobs = new ArrayList<>();

    public JobRepository() {
        jobs.add(new Job(1L, "Java Developer", "TCS"));
        jobs.add(new Job(2L, "Backend Developer", "Infosys"));
        jobs.add(new Job(3L, "Spring Boot Intern", "Wipro"));
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public Job getJobById(Long id) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                return job;
            }
        }
        return null;
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public List<Job> getJobsByCompany(String company) {
        List<Job> result = new ArrayList<>();

        for (Job job : jobs) {
            if (job.getCompany().equalsIgnoreCase(company)) {
                result.add(job);
            }
        }

        return result;
    }

    public int getJobCount() {
        return jobs.size();
    }

    public Job getJobByTitle(String title) {
        for (Job job : jobs) {
            if (job.getTitle().equalsIgnoreCase(title)) {
                return job;
            }
        }
        return null;
    }

    public boolean updateJob(Long id, Job updatedJob) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                job.setTitle(updatedJob.getTitle());
                job.setCompany(updatedJob.getCompany());
                return true;
            }
        }
        return false;
    }

    public boolean deleteJob(Long id) {
        for (Job job : jobs) {
            if (job.getId().equals(id)) {
                jobs.remove(job);
                return true;
            }
        }
        return false;
    }
}