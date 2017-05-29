package Dao;


import Beans.paso;

public interface pasoService {
	

		 void persistPaso(paso paso);
		  
		  paso findPasoById(int id);
		  
		  void updatePaso(paso paso);
		  
		  void deletePaso(paso paso) ;


}
