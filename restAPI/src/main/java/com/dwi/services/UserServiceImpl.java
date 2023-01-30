package com.dwi.services;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwi.models.entities.users;
import com.dwi.repository.UserRepository;

@Service
public class UserServiceImpl
    implements UserService {
 
    @Autowired
    private UserRepository userRepository;
 
    // Save operation
    @Override
    public users saveUser(users user)
    {
        return userRepository.save(user);
    }
 
    // Read operation
    @Override public List<users> fetchUserList()
    {
        return (List<users>)
            userRepository.findAll();
    }
 
    // Update operation
    @Override
    public users
    updateUser(users users, int id)
    {
 
        users userDB
            = userRepository.findById((long) id)
                  .get();
 
        if (Objects.nonNull(users.getNamalengkap())
            && !"".equalsIgnoreCase(
                users.getNamalengkap())) {
            userDB.setNamalengkap(
                users.getNamalengkap());
        }
 
        if (Objects.nonNull(
                users.getUsername())
            && !"".equalsIgnoreCase(
                users.getUsername())) {
            userDB.setUsername(
                users.getUsername());
        }
 
        if (Objects.nonNull(users.getPassword())
            && !"".equalsIgnoreCase(
                users.getPassword())) {
            userDB.setPassword(
                users.getPassword());
        }
 
        return userRepository.save(userDB);
    }
 
    // Delete operation
    @Override
    public void deleteUserById(int id)
    {
        userRepository.deleteById((long) id);
    }
}
