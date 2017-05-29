package Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="procedimiento")
public class procedimiento implements java.io.Serializable {

    @Id 
    @GeneratedValue
    private String ID;
    
	private String ORDEM_PASS;
	private String ORDEM_PROC;
	private String ORDEM_CASO;
	private String ID_CENARIO;
	private String ID_CASO;
	private String ID_PASO;
	private String ID_TELA;
	private String ID_CAMPO;
	private String ID_TYPE_ACTION;
	private String ID_ACTION;
	private String ATTACH_STRING;
	private String STARC_OBJECT_NAME;
	private String COORDINATES;
	private String VALUE_STRING;
	private String COMMENT;
	private String TYPE_FLOW;
	private String FLAG_PRINT;
	private String PRINT_STR;
	private String PASSED;
	private String ID_CAMPO_FULL;
	private String HOUR_START;
	private String HOUR_END;
	
	
	 
	procedimiento(){
		
	}
	
	
	public String getORDEM_PASS() {
		return ORDEM_PASS;
	}
	public void setORDEM_PASS(String oRDEM_PASS) {
		ORDEM_PASS = oRDEM_PASS;
	}
	public String getORDEM_PROC() {
		return ORDEM_PROC;
	}
	public void setORDEM_PROC(String oRDEM_PROC) {
		ORDEM_PROC = oRDEM_PROC;
	}
	public String getORDEM_CASO() {
		return ORDEM_CASO;
	}
	public void setORDEM_CASO(String oRDEM_CASO) {
		ORDEM_CASO = oRDEM_CASO;
	}
	public String getID_CENARIO() {
		return ID_CENARIO;
	}
	public void setID_CENARIO(String iD_CENARIO) {
		ID_CENARIO = iD_CENARIO;
	}
	public String getID_CASO() {
		return ID_CASO;
	}
	public void setID_CASO(String iD_CASO) {
		ID_CASO = iD_CASO;
	}
	public String getID_PASO() {
		return ID_PASO;
	}
	public void setID_PASO(String iD_PASO) {
		ID_PASO = iD_PASO;
	}
	public String getID_TELA() {
		return ID_TELA;
	}
	public void setID_TELA(String iD_TELA) {
		ID_TELA = iD_TELA;
	}
	public String getID_CAMPO() {
		return ID_CAMPO;
	}
	public void setID_CAMPO(String iD_CAMPO) {
		ID_CAMPO = iD_CAMPO;
	}
	public String getID_TYPE_ACTION() {
		return ID_TYPE_ACTION;
	}
	public void setID_TYPE_ACTION(String iD_TYPE_ACTION) {
		ID_TYPE_ACTION = iD_TYPE_ACTION;
	}
	public String getID_ACTION() {
		return ID_ACTION;
	}
	public void setID_ACTION(String iD_ACTION) {
		ID_ACTION = iD_ACTION;
	}
	public String getATTACH_STRING() {
		return ATTACH_STRING;
	}
	public void setATTACH_STRING(String aTTACH_STRING) {
		ATTACH_STRING = aTTACH_STRING;
	}
	public String getSTARC_OBJECT_NAME() {
		return STARC_OBJECT_NAME;
	}
	public void setSTARC_OBJECT_NAME(String sTARC_OBJECT_NAME) {
		STARC_OBJECT_NAME = sTARC_OBJECT_NAME;
	}
	public String getCOORDINATES() {
		return COORDINATES;
	}
	public void setCOORDINATES(String cOORDINATES) {
		COORDINATES = cOORDINATES;
	}
	public String getVALUE_STRING() {
		return VALUE_STRING;
	}
	public void setVALUE_STRING(String vALUE_STRING) {
		VALUE_STRING = vALUE_STRING;
	}
	public String getCOMMENT() {
		return COMMENT;
	}
	public void setCOMMENT(String cOMMENT) {
		COMMENT = cOMMENT;
	}
	public String getTYPE_FLOW() {
		return TYPE_FLOW;
	}
	public void setTYPE_FLOW(String tYPE_FLOW) {
		TYPE_FLOW = tYPE_FLOW;
	}
	public String getFLAG_PRINT() {
		return FLAG_PRINT;
	}
	public void setFLAG_PRINT(String fLAG_PRINT) {
		FLAG_PRINT = fLAG_PRINT;
	}
	public String getPRINT_STR() {
		return PRINT_STR;
	}
	public void setPRINT_STR(String pRINT_STR) {
		PRINT_STR = pRINT_STR;
	}
	public String getPASSED() {
		return PASSED;
	}
	public void setPASSED(String pASSED) {
		PASSED = pASSED;
	}
	public String getID_CAMPO_FULL() {
		return ID_CAMPO_FULL;
	}
	public void setID_CAMPO_FULL(String iD_CAMPO_FULL) {
		ID_CAMPO_FULL = iD_CAMPO_FULL;
	}
	public String getHOUR_START() {
		return HOUR_START;
	}
	public void setHOUR_START(String hOUR_START) {
		HOUR_START = hOUR_START;
	}
	public String getHOUR_END() {
		return HOUR_END;
	}
	public void setHOUR_END(String hOUR_END) {
		HOUR_END = hOUR_END;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}
}
