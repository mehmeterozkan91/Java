package com.datajpapostgresql.dto;

import com.datajpapostgresql.entity.Address;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 4:53 PM
 **/
@Data
public class UserDto {
	private Long          Id;
	private String        name;
	private String        surname;
	private List<String> addresses;
}
