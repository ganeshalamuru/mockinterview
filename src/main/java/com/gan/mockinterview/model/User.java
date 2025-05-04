package com.gan.mockinterview.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String displayName;

}
