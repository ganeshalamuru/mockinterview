package com.gan.mockinterview.repository;

import com.gan.mockinterview.model.Problem;

import java.util.List;

public interface ProblemRepository {

    Problem createProblem(Problem problem);

    List<Problem> getAllProblems();

}
