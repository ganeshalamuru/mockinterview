package com.gan.mockinterview.repository.impl;

import com.gan.mockinterview.model.Problem;
import com.gan.mockinterview.repository.ProblemRepository;
import com.gan.mockinterview.repository.rowmapper.ProblemRowMapper;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ProblemRepositoryImpl implements ProblemRepository {

    private final JdbcClient jdbcClient;

    @Override
    public Problem createProblem(Problem problem) {
        jdbcClient.sql("INSERT INTO problems (id, title, description) VALUES (:id, :title, :description)")
                .param(Problem.ID,problem.getId())
                .param(Problem.TITLE,problem.getTitle())
                .param(Problem.DESCRIPTION,problem.getDescription())
                .update();
        return problem;
    }

    @Override
    public List<Problem> getAllProblems() {
        return jdbcClient.sql("SELECT id, title, description FROM problems")
                .query(new ProblemRowMapper()).list();
    }
}
