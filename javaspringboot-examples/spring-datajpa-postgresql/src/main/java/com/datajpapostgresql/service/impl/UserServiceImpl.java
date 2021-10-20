package com.datajpapostgresql.service.impl;

import com.datajpapostgresql.dto.UserDto;
import com.datajpapostgresql.entity.Address;
import com.datajpapostgresql.entity.Users;
import com.datajpapostgresql.enums.AddressType;
import com.datajpapostgresql.repo.AddressRepository;
import com.datajpapostgresql.repo.UserRepository;
import com.datajpapostgresql.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 4:49 PM
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository    userRepository;
	private final AddressRepository addressRepository;

	@Override
	@Transactional
	public UserDto save(UserDto userDto) {
		//Assert.isNull(userDto.getName(), "Name is mandatory field.");
		//Assert.isNull(userDto.getSurname(), "Surname is mandatory field.");
		Users users = new Users();
		users.setName(userDto.getName());
		users.setSurname(userDto.getSurname());
		Users usersDb = userRepository.save(users);
		List<Address> addresses = new ArrayList<>();
		userDto.getAddresses().forEach(item -> {
			Address address= new Address();
			address.setAddress(item);
			address.setAddressType(AddressType.OTHER);
			address.setActive(true);
			address.setUsers(usersDb);
			addresses.add(address);
		});
		addressRepository.saveAll(addresses);
		userDto.setId(userDto.getId());
		return userDto;
	}

	@Override public void delete(Long id) {
	}

	@Override public List<UserDto> getAll() {
		List<Users> users = userRepository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		users.forEach(item ->{
			UserDto userDto = new UserDto();
			userDto.setName(item.getName());
			userDto.setSurname(item.getSurname());
			userDto.setId(item.getId());
			userDto.setAddresses(item.getAddresses().stream().map(Address::getAddress).collect(Collectors.toList()));
			userDtos.add(userDto);
		});
		return userDtos;
	}

	@Override public Page<UserDto> getAll(Pageable pageable) {
		return null;
	}
}
