package com.kkd.task_submission_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Submission{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    private Long taskId;

    @Setter
    private String githubLink;

    @Setter
    private Long userId;

    private String status = "PENDING";

    @Setter
    private LocalDateTime submissionTime;


    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTaskId() {
        return taskId;
    }
}