package com.udea.iw.dto;

import java.io.Serializable;

public class DireccionId implements Serializable {
//Declaración de variables
	private Long codigo;
	private Cliente cliente;
//Getters y Setters de cada variable para su manipulación
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	


}

