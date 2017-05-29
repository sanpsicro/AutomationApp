package Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="casoPrueba")
public class casoPrueba implements java.io.Serializable {

@Id
@GeneratedValue
private int ID_CASO;

private String NOMBRE_CASO;
private String PASOS; // numero de pasos asociados
private String ID_CENARIO; // id del escenario
private String ID_REQ; //id del requerimiento
private String DESCRIPCION; 
private String PRE_CONDICION;
private String RESULTADO_ESPERADO;
private String ORDEM_CASO;



public casoPrueba(){
	
	
}



public String getORDEM_CASO() {
	return ORDEM_CASO;
}



public void setORDEM_CASO(String oRDEM_CASO) {
	ORDEM_CASO = oRDEM_CASO;
}



public int getID_CASO() {
	return ID_CASO;
}



public void setID_CASO(int iD_CASO) {
	ID_CASO = iD_CASO;
}



public String getNOMBRE_CASO() {
	return NOMBRE_CASO;
}



public void setNOMBRE_CASO(String nOMBRE_CASO) {
	NOMBRE_CASO = nOMBRE_CASO;
}



public String getPASOS() {
	return PASOS;
}



public void setPASOS(String pASOS) {
	PASOS = pASOS;
}



public String getID_CENARIO() {
	return ID_CENARIO;
}



public void setID_CENARIO(String iD_CENARIO) {
	ID_CENARIO = iD_CENARIO;
}






public String getDESCRIPCION() {
	return DESCRIPCION;
}



public void setDESCRIPCION(String dESCRIPCION) {
	DESCRIPCION = dESCRIPCION;
}



public String getPRE_CONDICION() {
	return PRE_CONDICION;
}



public void setPRE_CONDICION(String pRE_CONDICION) {
	PRE_CONDICION = pRE_CONDICION;
}



public String getRESULTADO_ESPERADO() {
	return RESULTADO_ESPERADO;
}



public void setRESULTADO_ESPERADO(String rESULTADO_ESPERADO) {
	RESULTADO_ESPERADO = rESULTADO_ESPERADO;
}



public String getID_REQ() {
	return ID_REQ;
}



public void setID_REQ(String iD_REQ) {
	ID_REQ = iD_REQ;
}




}


