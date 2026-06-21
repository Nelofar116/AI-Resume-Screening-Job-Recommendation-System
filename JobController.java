package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Job;
import com.example.demo.service.JobService;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return jobService.getJobs();
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @PostMapping("/jobs")
    public String addJob(@RequestBody Job job) {
        jobService.addJob(job);
        return "Job Added Successfully";
    }

    @PutMapping("/jobs/{id}")
    public String updateJob(@PathVariable Long id,
                            @RequestBody Job updatedJob) {

        boolean updated = jobService.updateJob(id, updatedJob);

        if (updated) {
            return "Job Updated Successfully";
        }

        return "Job Not Found";
    }

    @DeleteMapping("/jobs/{id}")
    public String deleteJob(@PathVariable Long id) {

        boolean deleted = jobService.deleteJob(id);

        if (deleted) {
            return "Job Deleted Successfully";
        }

        return "Job Not Found";
    }

    @GetMapping("/jobs/company/{company}")
    public List<Job> getJobsByCompany(@PathVariable String company) {
        return jobService.getJobsByCompany(company);
    }

    @GetMapping("/jobs/title/{title}")
    public Job getJobByTitle(@PathVariable String title) {
        return jobService.getJobByTitle(title);
    }

    @GetMapping("/jobs/count")
    public String getJobCount() {
        return "Total Jobs: " + jobService.getJobCount();
    }
}