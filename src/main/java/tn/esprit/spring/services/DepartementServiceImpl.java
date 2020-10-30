package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.DepartementRepository;
import java.util.List;


@Service
public class DepartementServiceImpl implements IDepartementService {
	
	@Autowired
	DepartementRepository departementRepository;
	
	public int ajouterDepartement(Departement departement) {
		departementRepository.save(departement);
		return departement.getId();
	}
	
	public List<Departement> getAllDepartements() {
		return (List<Departement>) departementRepository.findAll();
	}
	


}
