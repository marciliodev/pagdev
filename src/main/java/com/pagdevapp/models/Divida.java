package com.pagdevapp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Divida implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@Column(name = "id_divida")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDivida;
	
	@NotNull
	@Column(name = "vl_divida")
	private BigDecimal vlDivida;
	
	@NotNull
	@Column(name = "dt_limite_pagamento")
	private String dtLimitePagamento;
	
	@NotNull
	@Column(name = "st_pagamento")
	private String status;
	
	@OneToMany
	private List<Devedor> devedores;
	
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
	public String getDtLimitePagamento() {
		return dtLimitePagamento;
	}
	public void setDtLimitePagamento(String dtLimitePagamento) {
		this.dtLimitePagamento = dtLimitePagamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
}
