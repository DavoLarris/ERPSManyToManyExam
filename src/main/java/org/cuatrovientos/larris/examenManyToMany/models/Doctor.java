package org.cuatrovientos.larris.examenManyToMany.models;

import java.util.List;

public class Doctor {
	private Long idDoctor;
	private String name;
	private String area;
	private List<Patient> patients;
	
	public Doctor() {

	}

	public Doctor(String name, String area) {
		this.name = name;
		this.area = area;
	}

	public Long getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	public void addDoctor(Patient patient) {
		this.patients.add(patient);
	}

	@Override
	public String toString() {
		return "Doctor [id=" + idDoctor + ", name=" + name + ", area=" + area + "]";
	}
	
	
}
