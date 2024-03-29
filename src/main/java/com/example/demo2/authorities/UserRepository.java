package com.example.demo2.authorities;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("SELECT u FROM  User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}
