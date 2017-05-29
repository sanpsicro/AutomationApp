package Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Beans.paso;

@Service("pasoService")
public class pasoServiceImpl implements pasoService{
	
	@Autowired
	pasoDao pasoDAO;

	@Override
	@Transactional
	public void persistPaso(paso paso) {
		pasoDAO.persistPaso(paso);
		
	}

	@Override
	@Transactional
	public paso findPasoById(int id) {
		// TODO Auto-generated method stub
		return pasoDAO.findPasoById(id);
	}

	@Override
	@Transactional
	public void updatePaso(paso paso) {
		pasoDAO.updatePaso(paso);
		
	}

	@Override
	@Transactional
	public void deletePaso(paso paso) {
		pasoDAO.deletePaso(paso);
		
	}

}
