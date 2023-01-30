package com.dwi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwi.models.entities.users;
 
public interface UserRepository extends JpaRepository<users, Long> {
     
}
