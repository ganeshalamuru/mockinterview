package com.gan.mockinterview.controller;

import com.gan.mockinterview.model.Problem;
import com.gan.mockinterview.service.ProblemService;
import com.gan.mockinterview.service.dto.ProblemCreationDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/problems")
@AllArgsConstructor
public class ProblemController {

    private final ProblemService problemService;

    @GetMapping("/")
    public ResponseEntity<List<Problem>> getAllProblems() {
        List<Problem> allProblems = problemService.getAllProblems();
        return new ResponseEntity<>(allProblems, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Problem> createUser(@Valid @RequestBody ProblemCreationDto problemCreationDto) {
        Problem problem = problemService.createProblem(problemCreationDto);
        return new ResponseEntity<>(problem, HttpStatus.OK);
    }

}
