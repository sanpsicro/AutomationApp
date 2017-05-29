package Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;








import Beans.escenario;


@Repository("escenariosDAO")
public class escenariosImplDAO implements escenariosDAO{
	
	

	@Autowired
	 private SessionFactory sessionFactory;
    
	@Override
	public void persistEscenario(escenario escenario) {
		sessionFactory.getCurrentSession().persist(escenario);

		
	}
    
	@Override
	public escenario findEscenarioById(int id) {
		return (escenario) sessionFactory.getCurrentSession().get(escenario.class, id);
	}
    
	@Override
	public void updateEscenario(escenario escenario) {
		sessionFactory.getCurrentSession().update(escenario);

		
	}
    
	@Override
	public void deleteEscenario(escenario escenario) {
		sessionFactory.getCurrentSession().delete(escenario);

		
	}

	


	}







