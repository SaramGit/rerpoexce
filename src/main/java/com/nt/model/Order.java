package com.nt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name = "Orders")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Order {
	
	@Id
	@Column(name = "orderid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	  private int orderid;
	@Column(name = "orderprodname")
	  private String orderprodname;
	 
	 private String custname;
	/* @Column(name = "orddt")
	 private Date orddt;
	 
	 @Column(name = "exptdt")
	 private Date exptdt;*/

}
