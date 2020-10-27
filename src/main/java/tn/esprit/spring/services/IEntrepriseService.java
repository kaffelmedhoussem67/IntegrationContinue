package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public interface IEntrepriseService {
	
	
	@Autowired
	EntrepriseRepository entrepriseRepository;

	
	
	public List<Entreprise> findAllEntreprisebyEmployeJPQL(int entid) {
		return entrepriseRepository.findAllEntrepriseByEmployeJPQL(entid);
	}

	
	public List<Entreprise> getAllEmployeByMission(int missionId) {
		return entrepriseRepository.getAllEntrepriseByMission(missionId);
	}

}
