package com.kkd.task_submission_service.service;

import com.kkd.task_submission_service.model.Submission;
import com.kkd.task_submission_service.model.TaskDto;
import com.kkd.task_submission_service.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SubmissionServiceImplementation implements SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Autowired
    private TaskService taskService;



    @Override
    public Submission submitTask(Long taskId, String githubLink, Long userId, String jwt) throws Exception {
        TaskDto task = taskService.getTaskById(taskId, jwt);
        if (task != null) {
            Submission submission = new Submission();
            submission.setTaskId(taskId);
            submission.setUserId(userId);
            submission.getGithubLink(githubLink);
            submission.setSubmissionTime(LocalDateTime.now());
            return submissionRepository.save(submission);
        }
        return null;

    }

    @Override
    public Submission getTaskSubmissionById(Long submissionId) throws Exception {
        return null;
    }

    @Override
    public List<Submission> getAllTaskSubmissions() {
        return List.of();
    }

    @Override
    public List<Submission> getTaskSubmissionsByTaskId(Long taskId) throws Exception {
        return List.of();
    }

    @Override
    public Submission acceptDeclineSubmission(Long id, String status) throws Exception {
        return null;
    }
}
