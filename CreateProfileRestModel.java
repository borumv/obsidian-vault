package com.example.profilesservice.rest;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateProfileRestModel {

    private Long userId;
    private String nickName;
    private String firstName;
    private String lastName;
    private String avatarUrl;
    private String aboutDescription;
    private LocalDate dateOfRegistry;
}
