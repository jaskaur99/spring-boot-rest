package com.jaspreet.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaspreet.spring_boot_rest.model.JobPost;
import com.jaspreet.spring_boot_rest.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();

    }

    // ***************************************************************************

    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }

    public JobPost getJob(int postId) {

        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);

    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);

    }

}