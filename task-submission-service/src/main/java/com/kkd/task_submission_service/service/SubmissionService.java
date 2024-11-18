package com.kkd.task_submission_service.service;

import com.kkd.task_submission_service.model.Submission;

import java.util.List;

public interface SubmissionService {

    Submission submitTask(Long taskId, String githunLink, Long userId, String jwt)throws Exception;

    Submission getTaskSubmissionById(Long submissionId) throws Exception;

    List<Submission> getAllTaskSubmissions();

    List<Submission> getTaskSubmissionsByTaskId(Long taskId) throws Exception;

    Submission acceptDeclineSubmission(Long id, String status) throws Exception;

}