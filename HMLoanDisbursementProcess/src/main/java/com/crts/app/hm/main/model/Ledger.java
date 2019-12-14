package com.crts.app.hm.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int lId;
}
