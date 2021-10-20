package com.datajpapostgresql.entity;

import com.datajpapostgresql.enums.AddressType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 **   Users : Mehmet ERÖZKAN
 **   Date : 19/10/2021
 **   Time : 2:20 PM
 **/
@Entity
@Table
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode(of = { "id" }) // iki nesnenin id'leri eşit ise bu iki nesne eşittir demek
@ToString
public class Address implements Serializable {
	@Id
	@SequenceGenerator(name = "seq_user_address", allocationSize = 1)
	@GeneratedValue(generator = "seq_user_address", strategy = GenerationType.SEQUENCE)
	private Long        Id;
	@Column(length = 500)
	private String      address;
	@Enumerated
	private AddressType addressType;
	private Boolean active;
	@ManyToOne(fetch = FetchType.EAGER) // default
	@JoinColumn
	private Users   users;
}
