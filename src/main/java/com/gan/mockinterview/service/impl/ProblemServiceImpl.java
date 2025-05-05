package com.gan.mockinterview.service.impl;

import com.gan.mockinterview.model.Problem;
import com.gan.mockinterview.repository.ProblemRepository;
import com.gan.mockinterview.service.ProblemService;
import com.gan.mockinterview.service.dto.ProblemCreationDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProblemServiceImpl implements ProblemService {

    private final ProblemRepository problemRepository;

    @Override
    public Problem createProblem(ProblemCreationDto problemCreationDto) {
        Problem problem = problemCreationDto.createProblem();
        return problemRepository.createProblem(problem);
    }

    @Override
    public List<Problem> getAllProblems() {
        return problemRepository.getAllProblems();
    }
}
