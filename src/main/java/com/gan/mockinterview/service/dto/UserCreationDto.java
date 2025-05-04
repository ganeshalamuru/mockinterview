package com.gan.mockinterview.service.dto;

import com.gan.mockinterview.model.User;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
public class UserCreationDto {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String displayName;

    public User createUser() {
        return User.builder()
                .id(UUID.randomUUID().toString())
                .firstName(getFirstName())
                .lastName(getLastName())
                .displayName(getDisplayName())
                .build();
    }

}
