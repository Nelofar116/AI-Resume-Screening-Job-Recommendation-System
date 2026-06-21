package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Job;
import com.example.demo.repository.JobRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getJobs() {
        return jobRepository.getJobs();
    }

    public Job getJobById(Long id) {
        return jobRepository.getJobById(id);
    }

    public void addJob(Job job) {
        jobRepository.addJob(job);
    }

    public List<Job> getJobsByCompany(String company) {
        return jobRepository.getJobsByCompany(company);
    }

    public int getJobCount() {
        return jobRepository.getJobCount();
    }

    public Job getJobByTitle(String title) {
        return jobRepository.getJobByTitle(title);
    }

    public boolean updateJob(Long id, Job updatedJob) {
        return jobRepository.updateJob(id, updatedJob);
    }

    public boolean deleteJob(Long id) {
        return jobRepository.deleteJob(id);
    }
}