package org.cuatrovientos.larris.examenManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.cuatrovientos.larris.examenManyToMany.dao.DoctorDAOInterface;
import org.cuatrovientos.larris.examenManyToMany.dao.PatientDAOInterface;
import org.cuatrovientos.larris.examenManyToMany.dao.impl.DoctorDAO;
import org.cuatrovientos.larris.examenManyToMany.dao.impl.PatientDAO;
import org.cuatrovientos.larris.examenManyToMany.models.Doctor;
import org.cuatrovientos.larris.examenManyToMany.models.Patient;


public class App 
{
    public static void main( String[] args )
    {
    	DoctorDAOInterface docDAO = new DoctorDAO();
    	PatientDAOInterface patientDAO = new PatientDAO();

    	
        // INSERT NEW DATA
    	Doctor doc1 = new Doctor("Doc 1","Area 69");
    	
    	List<Doctor> docs = new ArrayList<Doctor>();
    	docs.add(doc1);
    	
    	Patient pat1 = new Patient("Pat 1","Hembra");
    	Patient pat2 = new Patient("Pat 2","Hembra");
    	Patient pat3 = new Patient("Pat 3","Hembra");
    	List<Patient> pats = new ArrayList<Patient>();
    	pats.add(pat1);
    	pats.add(pat2);
    	pats.add(pat3);
    	
    	doc1.setPatients(pats);
    	
    	pat1.setDoctors(docs);
    	pat2.setDoctors(docs);

    	
    	docDAO.insert(doc1);
    	
    	System.out.println("\nShow data after insert");
    	// SELECT ALL DATA
    	List<Doctor> docsDao = docDAO.selectAll();
        
    	System.out.println("\n--- Doctor ----- table contents -----------");
        
        for(Doctor doc : docsDao) {
        	String docAll = "";
        	docAll = "Id: " + doc.getIdDoctor() + 
        					" - Name: " + doc.getName() +
        					" - Area: " + doc.getArea() +
        					" - Patients: ";
        	
        	System.out.println(docAll);
        	
        					List<Patient> patients = doc.getPatients();
        					
        					for (int i = 0; i < patients.size(); i++) {
        						System.out.println("   +" + patients.get(i).toString());
        					}
        }
        
    }
}
