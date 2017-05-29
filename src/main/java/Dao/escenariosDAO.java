package Dao;



import Beans.escenario;

public interface escenariosDAO {
	

	 void persistEscenario(escenario escenario);
	  
	  escenario findEscenarioById(int id);
	  
	  void updateEscenario(escenario escenario);
	  
	  void deleteEscenario(escenario escenario) ;
	

}
