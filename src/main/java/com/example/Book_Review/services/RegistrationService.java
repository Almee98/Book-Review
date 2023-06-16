package com.example.Book_Review.services;

import com.example.Book_Review.web.entity.User;
import com.example.Book_Review.web.model.UserModel;

public interface RegistrationService {
    User registerUser(UserModel userModel);
}
