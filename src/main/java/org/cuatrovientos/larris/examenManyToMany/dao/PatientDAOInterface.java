package org.cuatrovientos.larris.examenManyToMany.dao;

import java.util.List;

import org.cuatrovientos.larris.examenManyToMany.models.Patient;


public interface PatientDAOInterface {
	
	public List<Patient> selectAll ();
	public void insert (Patient patient);

}
