package Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="escenario")
public class escenario implements java.io.Serializable {
 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
    @Column(name="ID_CENARIO")
	private int ID_CENARIO;
	
	@Column(name="DESCRIPCION")
	private String DESCRIPCION;
	
	@Column(name="NOMBRE")
	private String NOMBRE;
	
	@Column(name="CASOS")
	private String CASOS; //NÚMERO DE CASOS CONTENIDOS EN EL ESCENARIO
	
	
   public escenario(){
		
	}
	
	public int getID_CENARIO() {
		return ID_CENARIO;
	}


	public void setID_CENARIO(int iD_CENARIO) {
		ID_CENARIO = iD_CENARIO;
	}


	public String getDESCRIPCION() {
		return DESCRIPCION;
	}


	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}


	public String getNOMBRE() {
		return NOMBRE;
	}


	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}


	public String getCASOS() {
		return CASOS;
	}


	public void setCASOS(String cASOS) {
		CASOS = cASOS;
	}


	
	
	
	
}
