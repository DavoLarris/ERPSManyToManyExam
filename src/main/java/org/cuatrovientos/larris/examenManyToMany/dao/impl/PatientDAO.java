package org.cuatrovientos.larris.examenManyToMany.dao.impl;

import java.util.List;

import org.cuatrovientos.larris.examenManyToMany.HibernateSession;
import org.cuatrovientos.larris.examenManyToMany.dao.PatientDAOInterface;
import org.cuatrovientos.larris.examenManyToMany.models.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PatientDAO implements PatientDAOInterface{

	public List<Patient> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Patient> patients = session.createQuery("from Patient").list();
	    
	    session.close();
	    return patients;
	}

	public void insert(Patient patient) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.merge(patient);
	         
	    session.getTransaction().commit();
	    session.close();
		
	}
	
}
