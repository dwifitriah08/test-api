package com.dwi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dwi.models.entities.users;
import com.dwi.services.UserService;

@RestController
// Class
public class UserController {
 
    @Autowired private UserService userService;
 
    // Save operation
    @PostMapping("/users")
 
    public users saveDepartment(
        @Validated @RequestBody users user)
    {
        return userService.saveUser(user);
    }
 
    // Read operation
    @GetMapping("/users")
 
    public List<users> fetchUserList()
    {
        return userService.fetchUserList();
    }
 
    // Update operation
    @PutMapping("/users/{id}")
 
    public users
    updateUsers(@RequestBody users users,
                     @PathVariable("id") int id)
    {
        return userService.updateUser(
            users, id);
    }
 
    // Delete operation
    @DeleteMapping("/users/{id}")
 
    public String deleteUserById(@PathVariable("id")
                                       int id)
    {
        userService.deleteUserById(
            id);
        return "Deleted Successfully";
    }
}
