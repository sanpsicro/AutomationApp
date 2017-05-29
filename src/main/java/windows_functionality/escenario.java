package windows_functionality;

import java.util.List;

public class escenario {
	
	private String nombre_esc;
	private String id_esc;
	
	
	public  escenario(String nombre_esc, String id_esc) {
		
		
		
	this.nombre_esc = nombre_esc;
	this.id_esc = id_esc;
	}
	
	@Override
	public String toString(){
		return  id_esc + " " + nombre_esc  ;
		
		
	}
	

}
