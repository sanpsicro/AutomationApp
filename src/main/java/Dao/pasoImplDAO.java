package Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Beans.paso;


@Repository("pasoDao")
public class pasoImplDAO implements pasoDao{
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void persistPaso(paso paso) {
		sessionFactory.getCurrentSession().persist(paso);
		
	}

	@Override
	public paso findPasoById(int id) {
		// TODO Auto-generated method stub
		return (paso) sessionFactory.getCurrentSession().get(paso.class, id);
	}

	@Override
	public void updatePaso(paso paso) {
		sessionFactory.getCurrentSession().update(paso);
		
	}

	@Override
	public void deletePaso(paso paso) {
		sessionFactory.getCurrentSession().delete(paso);
		
	}

}
