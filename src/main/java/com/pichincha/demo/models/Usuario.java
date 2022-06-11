package com.pichincha.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	private int cedula;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido; 
	
	@Column
	private String telefono;
	
	@Column
	private int edad;
	
	@Column
	private String n_cuenta;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, int cedula, String nombre, String apellido, String telefono, int edad, String n_cuenta) {
		super();
		//this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido; 
		this.telefono = telefono;
		this.edad = edad;
		this.n_cuenta = n_cuenta;
	}

	//setters y getters
	/*
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	*/
	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	



	

}
