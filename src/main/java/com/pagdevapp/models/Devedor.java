package com.pagdevapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Devedor {
	
	@ApiModelProperty(value = "CPF do devedor")
	@Id
	@NotEmpty
	@Column(name = "id_devedor")
	private String cpfDevedor;
	
	@ApiModelProperty(value = "Nome do devedor")
	@NotEmpty
	@Column(name = "nm_devedor")
	private String nmDevedor;
	
	@ApiModelProperty(value = "E-mail do devedor")
	@NotEmpty
	@Column(name = "email_devedor")
	private String emailDevedor;
	
	@ApiModelProperty(value = "Telefone do devedor")
	@NotEmpty
	@Column(name = "telefone_devedor")
	private String telefoneDevedor;
	
	@ApiModelProperty(value = "Dvida do devedor")
	@ManyToOne
	private Divida divida;
	
	public String getCpfDevedor() {
		return cpfDevedor;
	}
	public void setCpfDevedor(String cpfDevedor) {
		this.cpfDevedor = cpfDevedor;
	}
	public String getNmDevedor() {
		return nmDevedor;
	}
	public void setNmDevedor(String nmDevedor) {
		this.nmDevedor = nmDevedor;
	}
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public String getTelefoneDevedor() {
		return telefoneDevedor;
	}
	public void setTelefoneDevedor(String telefoneDevedor) {
		this.telefoneDevedor = telefoneDevedor;
	}
	public Divida getDivida() {
		return divida;
	}
	public void setDivida(Divida divida) {
		this.divida = divida;
	}
	
}
