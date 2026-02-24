package com.rishitha.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.rishitha.jobportal.entity.Job;
import com.rishitha.jobportal.repository.JobRepository;
import com.rishitha.jobportal.service.JobService;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "*")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }
     @Autowired
    private JobRepository jobRepository;

    @GetMapping
    public List<Job> getAllJobs1() {
        return jobRepository.findAll();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
        return "Job deleted successfully!";
    }

}
