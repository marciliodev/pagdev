package com.pagdevapp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Divida implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	@ApiModelProperty(value = "Código da divida")
	@Id
	@Column(name = "id_divida")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDivida;
	
	@ApiModelProperty(value = "Valor da divida")
	@NotNull
	@Column(name = "vl_divida")
	private BigDecimal vlDivida;
	
	@ApiModelProperty(value = "Data de Pagamento")
	@NotEmpty
	@Column(name = "dt_limite_pagamento")
	private String dtLimitePagamento;
	
	@ApiModelProperty(value = "Situação do Pagamento")
	@NotEmpty
	@Column(name = "st_pagamento")
	private String status;
	
	@ApiModelProperty(value = "Lista de Devedores")
	@OneToMany(mappedBy="divida", cascade=CascadeType.ALL, orphanRemoval = false)
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
