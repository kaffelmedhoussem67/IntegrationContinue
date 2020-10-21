package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise, Integer>  {
	
	public List<Entreprise> findAllEntrepriseyEmployeJPQL(int entid);
	public List<Entreprise> getAllEmployeByMission(int missionId);
}