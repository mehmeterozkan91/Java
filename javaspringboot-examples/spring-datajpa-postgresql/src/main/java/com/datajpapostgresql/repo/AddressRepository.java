package com.datajpapostgresql.repo;

import com.datajpapostgresql.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 4:05 PM
 **/
public interface AddressRepository extends JpaRepository<Address, Long> {
}
