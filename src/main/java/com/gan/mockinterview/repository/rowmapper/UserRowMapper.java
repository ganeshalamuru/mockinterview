package com.gan.mockinterview.repository.rowmapper;

import com.gan.mockinterview.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return User.builder()
                .id(rs.getString(User.ID))
                .firstName(rs.getString(User.FIRST_NAME))
                .lastName(rs.getString(User.LAST_NAME))
                .status(rs.getString(User.STATUS))
                .displayName(rs.getString(User.DISPLAY_NAME))
                .build();
    }
}
