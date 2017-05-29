package Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Beans.escenario;



@Service("escenarioService")
public class EscenarioServiceImpl implements EscenarioService {
	
	@Autowired
	escenariosDAO escenariosDAO;
    
	@Transactional
	public void persistEscenario(escenario escenario) {
		escenariosDAO.persistEscenario(escenario);
		
	}
    
	@Override
	@Transactional
	public escenario findEscenarioById(int id) {
		return escenariosDAO.findEscenarioById(id);
	}
    
	@Override
	@Transactional
	public void updateEscenario(escenario escenario) {
		escenariosDAO.updateEscenario(escenario);
		
	}

	@Override
	@Transactional
	public void deleteEscenario(escenario escenario) {
		escenariosDAO.deleteEscenario(escenario);
		
	}
	








}


