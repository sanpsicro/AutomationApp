package Dao;

import Beans.paso;

public interface pasoDao {
	void persistPaso(paso paso);
	  
	  paso findPasoById(int id);
	  
	  void updatePaso(paso paso);
	  
	  void deletePaso(paso paso) ;
}


