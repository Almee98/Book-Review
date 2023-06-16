package com.example.Book_Review.web.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {

    private Long id;
    private String username;
    private String email;

    private String password;
//    private String matchingPassword;

}
