package com.gan.mockinterview.service.dto;

import com.gan.mockinterview.model.Problem;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Getter
public class ProblemCreationDto {

    @NotEmpty
    private String title;
    @NotEmpty
    private String description;

    public Problem createProblem() {
        return Problem.builder()
                .id(UUID.randomUUID().toString())
                .title(getTitle())
                .description(getDescription())
                .build();
    }

}
