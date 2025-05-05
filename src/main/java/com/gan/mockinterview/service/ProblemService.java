package com.gan.mockinterview.service;

import com.gan.mockinterview.model.Problem;
import com.gan.mockinterview.service.dto.ProblemCreationDto;

import java.util.List;

public interface ProblemService {

    Problem createProblem(ProblemCreationDto problemCreationDto);

    List<Problem> getAllProblems();

}
