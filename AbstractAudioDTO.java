package com.xworkz.terrorist.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public abstract class AbstractAudioDTO implements Serializable {
	
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
	private String createdBy;
	private LocalDateTime createdAt;
	private String updateBy;
	private LocalDateTime updateAt;

}
