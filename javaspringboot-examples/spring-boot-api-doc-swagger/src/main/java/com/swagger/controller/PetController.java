package com.swagger.controller;

import com.swagger.entity.Pets;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 8:15 AM
 **/
@RestController
@RequestMapping("/pets")
@Api(value="Pets Api documentaion")
public class PetController {
	private List<Pets> pets = new ArrayList<>();

	@PostConstruct
	public void init(){
		pets.add(new com.swagger.entity.Pets(1,"Test Pets", new Date()));
	}

	@PostMapping
	@ApiOperation(value="Create pet method", notes="Be carefull this method")
	public ResponseEntity<Pets> add(@RequestBody @ApiParam(value="animal") Pets pet){
		pets.add(pet);
		return ResponseEntity.ok(pet);
	}

	@GetMapping
	@ApiOperation(value="Pets List method", notes="Get All Method")
	public ResponseEntity<List<Pets>> getAllData(){
		return ResponseEntity.ok(pets);
	}
}
