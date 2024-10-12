package com.ninos.notes.security.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class LoginResponse {

    private String username;
    private List<String> roles;
    private String jwtToken;



}
