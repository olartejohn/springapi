package com.edu.uniminuto.modelo;

public class Especialista {
	
	Long id;
	String nombre;
	String phoneNumber;
	String email;
	
	public Especialista() {
		super();
	}
	
	public Especialista(long l, String nombre, String phoneNumber, String email) {
		
		super();
	    this.id =l;
	    this.nombre=nombre;
	    this.phoneNumber=phoneNumber;
	    this.email=email;
	    
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Especialista [id=" + id + ", nombre=" + nombre + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	
	
	

}
