package com.xworkz.bridge.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bridge_table")
public class BridgeEntity {
	
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_type")
	private String type;
	@Column(name="b_cost")
	private int cost;
	@Column(name="b_location")
	private String location;
	@Column(name="b_noOfWorkers")
	private int noOfWorkers;

}
