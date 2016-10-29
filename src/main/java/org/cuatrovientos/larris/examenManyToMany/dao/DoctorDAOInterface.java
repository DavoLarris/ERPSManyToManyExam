package org.cuatrovientos.larris.examenManyToMany.dao;

import java.util.List;

import org.cuatrovientos.larris.examenManyToMany.models.Doctor;

public interface DoctorDAOInterface {
	
	public List<Doctor> selectAll ();
	public void insert (Doctor doctor);

}
