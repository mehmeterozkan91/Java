package com.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 22/10/2021
 **   Time : 8:44 AM
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="Pets subject", description = "Pets Subject descr ")
public class Pets {
	@ApiModelProperty(value="Pets Identifier")
	private int    id;
	@ApiModelProperty(value="Pets Name")
	private String name;
	@ApiModelProperty(value="Pets date")
	private Date   date;
}
