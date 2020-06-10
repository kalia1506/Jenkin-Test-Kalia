package com.kcpit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "customer_dtls")
public class CustomerDtlsEntity {
	@Id
	@Column(name = "cust_id")
	@SequenceGenerator(name = "custo_id",sequenceName = "CUSTOMER_ID_SEQ",allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator ="custo_id" )
	private Integer customerId;
	@Column(name = "cust_name")
	private String customerName;
	@Column(name = "cust_email")
	private String CustomerEmail;
}
