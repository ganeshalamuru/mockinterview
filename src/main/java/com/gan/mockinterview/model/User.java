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

    public static final String ID = "id";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String STATUS = "status";
    public static final String DISPLAY_NAME = "display_name";

    private String id;
    private String firstName;
    private String lastName;
    /**
     * {@link com.gan.mockinterview.model.enums.UserStatus}
     */
    private String status;
    private String displayName;

}
