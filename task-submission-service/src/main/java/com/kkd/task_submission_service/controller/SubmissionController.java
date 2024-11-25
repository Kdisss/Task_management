package com.kkd.task_submission_service.controller;

import com.kkd.task_submission_service.model.Submission;
import com.kkd.task_submission_service.service.SubmissionService;
import com.kkd.task_submission_service.service.TaskService;
import com.kkd.task_submission_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @Autowired
    private UserService userService;

    @Autowired
    private TaskService taskService;

    @PostMapping()
    public ResponseEntity<Submission>submitTask(
            @RequestParam Long task_id,
            @RequestParam String github_link,
            @RequestHeader ("Authorization") String jwt
    )throws Exception{
        
    }
}
