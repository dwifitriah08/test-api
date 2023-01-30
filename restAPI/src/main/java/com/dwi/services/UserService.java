package com.dwi.services;

import java.util.List;

import com.dwi.models.entities.users;

public interface UserService {
 
    // Save operation
    users saveUser(users users);
 
    // Read operation
    List<users> fetchUserList();
 
    // Update operation
    users updateUser(users department, int id);
 
    // Delete operation
    void deleteUserById(int id);
}
