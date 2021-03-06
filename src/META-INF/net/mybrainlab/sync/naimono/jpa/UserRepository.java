package com.khoubyari.example.dao.jpa;

import com.khoubyari.example.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

}