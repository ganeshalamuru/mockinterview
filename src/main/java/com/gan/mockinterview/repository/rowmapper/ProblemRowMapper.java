package com.gan.mockinterview.repository.rowmapper;

import com.gan.mockinterview.model.Problem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProblemRowMapper implements RowMapper<Problem> {

    @Override
    public Problem mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Problem.builder()
                .id(rs.getString(Problem.ID))
                .title((rs.getString(Problem.TITLE)))
                .description(rs.getString(Problem.DESCRIPTION))
                .build();
    }
}
