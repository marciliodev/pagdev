package com.pagdevapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Devedor {
	
	@Id
	@NotEmpty
	@Column(name = "id_devedor")
	private String cpfDevedor;
	
	@NotEmpty
	@Column(name = "nm_devedor")
	private String nmDevedor;
	
	@NotEmpty
	@Column(name = "email_devedor")
	private String emailDevedor;
	
	@NotEmpty
	@Column(name = "telefone_devedor")
	private String telefoneDevedor;
	
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
