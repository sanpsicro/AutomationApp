package Dao;

import Beans.escenario;

public interface EscenarioService {
	
	
      void persistEscenario(escenario escenario);

       escenario findEscenarioById(int id);

		void updateEscenario(escenario escenario);

		void deleteEscenario(escenario escenario);

	
	

}
