package org.cuatrovientos.larris.examenManyToMany.dao.impl;

import java.util.List;

import org.cuatrovientos.larris.examenManyToMany.HibernateSession;
import org.cuatrovientos.larris.examenManyToMany.dao.DoctorDAOInterface;
import org.cuatrovientos.larris.examenManyToMany.models.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DoctorDAO implements DoctorDAOInterface{


	public List<Doctor> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Doctor> users = session.createQuery("from Doctor").list();
	    
	    session.close();
	    return users;
	}

	public void insert(Doctor doctor) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.merge(doctor);
	         
	    session.getTransaction().commit();
	    session.close();
	}

}
