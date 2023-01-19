package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDto implements Serializable {
	
	
	private String createdBy;
	private LocalDateTime createdAt;
	private String updateBy;
	private LocalDateTime updateAt;

}
