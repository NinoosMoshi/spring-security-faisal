package com.ninos.notes.security.request;

import java.util.Set;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SignupRequest {

    @NotBlank(message = "Invalid Username: Empty username")
    @Size(min = 3, max = 20, message = "Invalid Username: Must be between 3 - 20 characters")
    private String username;

    @NotBlank(message = "Invalid Email: Empty email")
    @Size(max = 50,message = "Invalid Email: The maximum is 50 characters")
    @Email
    private String email;

    @Setter
    @Getter
    private Set<String> role;

    @NotBlank(message = "Invalid Password: Empty password")
    @Size(min = 6, max = 40,message = "Invalid Password: Must be between 6 - 40 characters")
    private String password;
}
