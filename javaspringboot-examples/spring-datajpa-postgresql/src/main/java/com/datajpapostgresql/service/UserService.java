package com.datajpapostgresql.service;

import com.datajpapostgresql.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 4:48 PM
 **/
public interface UserService {
	UserDto save(UserDto userDto);
	void delete(Long id);
	List<UserDto> getAll();
	Page<UserDto> getAll(Pageable pageable);
}
