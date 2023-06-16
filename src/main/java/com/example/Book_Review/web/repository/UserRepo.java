package com.example.Book_Review.web.repository;

import com.example.Book_Review.web.entity.User;
import com.example.Book_Review.web.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    UserModel findByUsername(String username);

    UserModel findByEmail(String email);

}
