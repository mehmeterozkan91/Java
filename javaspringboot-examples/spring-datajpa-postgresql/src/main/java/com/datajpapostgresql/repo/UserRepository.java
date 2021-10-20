package com.datajpapostgresql.repo;

import com.datajpapostgresql.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 4:05 PM
 **/
public interface UserRepository extends JpaRepository<Users, Long> {
}
