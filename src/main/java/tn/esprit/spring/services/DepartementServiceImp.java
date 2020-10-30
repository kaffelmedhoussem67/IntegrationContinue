package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImp implements IDepartementService {
	@Autowired
	DepartementRepository deptRepoistory;
	
	public int ajouterDepartement(Departement Departement) {
		deptRepoistory.save(Departement);
		return Departement.getId();
	}
	
	public List<Departement> getAllDepartements() {
		return (List<Departement>) deptRepoistory.findAll();
}
	
	public void deleteDepartementById(int DepartementId){
		  deptRepoistory.deleteById(DepartementId);
		}
		
	}


