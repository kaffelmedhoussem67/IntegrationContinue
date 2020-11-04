
package tn.esprit.spring.controller;

import org.springframework.web.bind.annotation.RestController;



import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RestController
public class RestControlDepartement {
	private static final Logger l = Logger.getLogger(RestControlDepartement.class);

	@Autowired
	IDepartementService iDepartementservice;
	
	/*@PostMapping("/ajouterDepartement")
	@ResponseBody
	public Departement ajouterDepartement(@RequestBody Departement departement)
	{
		iDepartementservice.ajouterDepartement(departement);
		l.info("Departement ajouté ");

		return departement;
	}
	*/
	
    @DeleteMapping("/deleteDepartementById/{idemp}") 
	@ResponseBody 
	public void deleteDepartementById(@PathVariable("idemp")int DepartementId) {
    	iDepartementservice.deleteDepartementById(DepartementId);
		l.info("Departement supprimé ");
	}
    
	
    @GetMapping(value = "/getAllDepartements")
    @ResponseBody
	public List<Departement> getAllDepartements() {
		
		l.info("afficher tous les employees ");
    	return iDepartementservice.getAllDepartements();

	}
    
    
}

