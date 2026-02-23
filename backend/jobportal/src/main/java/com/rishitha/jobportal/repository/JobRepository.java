package com.rishitha.jobportal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rishitha.jobportal.entity.Job;
public interface JobRepository extends JpaRepository<Job, Long> {

}
