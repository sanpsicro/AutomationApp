package Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Entity_admon")
public class Entity_admon implements java.io.Serializable {
	
	@Id
	@GeneratedValue
	private String ID;
	
	private String TYPE;
	private String CREATED_TIME;
	private String MODIFIED_TIME;
	private String PRESENCE;
	private String DELETED;
	private String CREATOR_ID;
	
	
	Entity_admon(){
		
		
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getTYPE() {
		return TYPE;
	}


	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}


	public String getCREATED_TIME() {
		return CREATED_TIME;
	}


	public void setCREATED_TIME(String cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}


	public String getMODIFIED_TIME() {
		return MODIFIED_TIME;
	}


	public void setMODIFIED_TIME(String mODIFIED_TIME) {
		MODIFIED_TIME = mODIFIED_TIME;
	}


	public String getPRESENCE() {
		return PRESENCE;
	}


	public void setPRESENCE(String pRESENCE) {
		PRESENCE = pRESENCE;
	}


	public String getDELETED() {
		return DELETED;
	}


	public void setDELETED(String dELETED) {
		DELETED = dELETED;
	}


	public String getCREATOR_ID() {
		return CREATOR_ID;
	}


	public void setCREATOR_ID(String cREATOR_ID) {
		CREATOR_ID = cREATOR_ID;
	}
	
	

}
