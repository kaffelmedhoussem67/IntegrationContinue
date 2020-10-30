package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@Controller
public class IControllerDepartementImpl {

	@Autowired
	IDepartementService iDepartementservice;
	
	public int ajouterDepartement(Departement departement)
	{
		iDepartementservice.ajouterDepartement(departement);
		return departement.getId();
	}
	
	public void deleteDepartementById(int departementId) {
		iDepartementservice.deleteDepartementById(departementId);
		
	}
	
    public List<Departement> getAllDepartements() {
		
		return iDepartementservice.getAllDepartements();
	}
	
	
}
