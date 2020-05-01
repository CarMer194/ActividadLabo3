package com.uca.capas.ActividadLabo3.domain;

public class Estudiante {
	private String nombre,apellido,fentrada,carrera;
	private Boolean estado;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFentrada() {
		return fentrada;
	}
	public void setFentrada(String fentrada) {
		this.fentrada = fentrada;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Estudiante(String nombre, String apellido, String fentrada, String carrera, Boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fentrada = fentrada;
		this.carrera = carrera;
		this.estado = estado;
	}
	
	public String delegateEstado() {
		return this.estado ? "Activo":"Inactivo";
	}
	public Estudiante() {
		super();
	}
}
