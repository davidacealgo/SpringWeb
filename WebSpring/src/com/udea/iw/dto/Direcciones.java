package com.udea.iw.dto;

public class Direcciones{
//Declaración de variables
	private DireccionId id;
	private String direccion;
	private String telefono;
	private int ciudad;
	private boolean preferido;
//Getters y Setters de cada variable para su manipulación
	
	public DireccionId getId() {
		return id;
	}
	public void setId(DireccionId id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCiudad() {
		return ciudad;
	}
	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}
	public boolean isPreferido() {
		return preferido;
	}
	public void setPreferido(boolean preferido) {
		this.preferido = preferido;
	}
	
	
}

