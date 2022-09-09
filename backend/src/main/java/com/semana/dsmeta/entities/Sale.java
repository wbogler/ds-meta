package com.semana.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "seller_name")
	private String sallerName;
	
	@Column(name = "visited")
	private Integer visited;
	
	@Column(name = "deals")
	private Integer deals;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "date")
	private LocalDate date;
}
