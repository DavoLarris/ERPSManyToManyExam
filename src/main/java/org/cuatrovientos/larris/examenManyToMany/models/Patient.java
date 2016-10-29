package org.cuatrovientos.larris.examenManyToMany.models;


import java.util.List;

public class Patient {
	private Long idPatient;
	private String name;
	private String sex;
	private List<Doctor> doctors;
	
	public Patient() {
		
	}

	public Patient(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public Long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	public void addPatient(Doctor doctor) {
		this.doctors.add(doctor);
	}

	@Override
	public String toString() {
		return "Patient [id=" + idPatient + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
	
}
