package com.pagdevapp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.pagdevapp.utils.LocalDateTimeSerializer;
import com.sun.istack.NotNull;

@Entity
public class Divida implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@Column(name = "id_divida")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDivida;
	
	@NotNull
	@Column(name = "vl_divida")
	private BigDecimal vlDivida;
	
	@NotNull
	@Column(name = "dt_limite_pagamento")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime dtLimitePagamento;
	
	@NotNull
	@Column(name = "st_pagamento")
	private String status;
	
	public Long getIdDivida() {
		return idDivida;
	}
	public void setIdDivida(Long idDivida) {
		this.idDivida = idDivida;
	}
	public BigDecimal getVlDivida() {
		return vlDivida;
	}
	public void setVlDivida(BigDecimal vlDivida) {
		this.vlDivida = vlDivida;
	}
	public LocalDateTime getDtLimitePagamento() {
		return dtLimitePagamento;
	}
	public void setDtLimitePagamento(LocalDateTime dtLimitePagamento) {
		this.dtLimitePagamento = dtLimitePagamento;
	}
	public String getIdStatus() {
		return status;
	}
	public void setIdStatus(String status) {
		this.status = status;
	}	
}
