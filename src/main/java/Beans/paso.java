package Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paso")
public class paso implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PASO")
	private int ID_PASO;
 
	@Column(name="ID_CASO")
	private String ID_CASO; // id del caso de prueba al que esta asociado
	
	@Column(name="ID_TYPE_ACTION")
	private String TYPE; // tipo de paso , equivalente a ejecutar operación o ingresar datos o verificar mensaje
	
	@Column(name="ORDEM_PASS")
	private String ORDEM_PASS;
	
	@Column(name="ID_CENARIO")
	private String ID_CENARIO;
	
	@Column(name="DESCRIPCION")
	private String DESCRIPCION;
	
	@Column(name="RESULTADO_ESPERADO")
	private String RESULTADO_ESPERADO;

	
	



	public String getDESCRIPCION() {
		return DESCRIPCION;
	}


	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
	}


	public String getRESULTADO_ESPERADO() {
		return RESULTADO_ESPERADO;
	}


	public void setRESULTADO_ESPERADO(String rESULTADO_ESPERADO) {
		RESULTADO_ESPERADO = rESULTADO_ESPERADO;
	}


	public paso(){
		
		
	}
	
	
	public int getID_PASO() {
		return ID_PASO;
	}
	public void setID_PASO(int iD_PASO) {
		ID_PASO = iD_PASO;
	}
	public String getID_CASO() {
		return ID_CASO;
	}
	public void setID_CASO(String iD_CASSO) {
		ID_CASO = iD_CASSO;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getORDEM_PASS() {
		return ORDEM_PASS;
	}
	public void setORDEM_PASS(String oRDEM_PASS) {
		ORDEM_PASS = oRDEM_PASS;
	}





	public String getID_CENARIO() {
		return ID_CENARIO;
	}


	public void setID_CENARIO(String iD_CENARIO) {
		ID_CENARIO = iD_CENARIO;
	}


}
