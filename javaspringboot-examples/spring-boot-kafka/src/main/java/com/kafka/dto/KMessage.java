package com.kafka.dto;

/**
 **   User : Mehmet ERÖZKAN
 **   Date : 02/11/2021
 **   Time : 2:01 PM
 **/

import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "message", "messageDate"})
public class KMessage {
	private String message;
	private String id = UUID.randomUUID().toString();
	private LocalDate messageDate = LocalDate.now();
}
