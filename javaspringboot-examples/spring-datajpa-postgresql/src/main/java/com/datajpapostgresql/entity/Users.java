package com.datajpapostgresql.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 2:17 PM
 **/
@Entity
@Table
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode(of = { "id" }) // iki nesnenin id'leri eşit ise bu iki nesne eşittir demek
@ToString
public class Users {
	@Id
	@SequenceGenerator(name = "seq_user", allocationSize = 1)
	@GeneratedValue(generator = "seq_user_address", strategy = GenerationType.SEQUENCE)
	private Long          Id;
	@Column(length = 100)
	private String        name;
	@Column(length = 100)
	private String        surname;
	@OneToMany
	@JoinColumn
	private List<Address> addresses;
}
