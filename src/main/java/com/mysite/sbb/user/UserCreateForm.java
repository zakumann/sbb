package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "Require UserID.")
    private String username;

    @NotEmpty(message = "Require password.")
    private String password1;

    @NotEmpty(message = "Require password confirm.")
    private String password2;

    @NotEmpty(message = "Require Email.")
    @Email
    private String email;
}