package windows_processes;

import java.awt.event.ActionEvent;

import Automation_windows.casosPrueba;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Automation_windows.*;
import Beans.casoPrueba;
import Beans.escenario;
import Beans.paso;
import Dao.EscenarioService;
import Dao.pasoService;


@Configuration
public class casosPrueba_process {
	static String descripcion;
	static String resultado_esperado;

	@Bean
	public void btn_GUARDAR(){
		
          
	     
	       
	
			
			String tipoPaso = "";
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//String resultado_esperado = new casosPrueba().getEditorPane_4().getText();
			
			
			if( !tipoPaso.isEmpty()){
				
				try {
					ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
					paso newPaso = new paso();
					
					//newPaso.setID_CENARIO(iD_CENARIO);
					//newPaso.setID_CASO(iD_CASSO);
					
					
					newPaso.setDESCRIPCION(descripcion);
					newPaso.setRESULTADO_ESPERADO(resultado_esperado);
					//newPaso.setORDEM_PASS(oRDEM_PASS);
					newPaso.setTYPE(tipoPaso);
					pasoService emService = (pasoService) context.getBean("pasoService");
					emService.persistPaso(newPaso);
					context.close();
					JOptionPane.showMessageDialog(null, "Guardado");
					
				} catch (BeansException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar guardar el paso");
				}
				
			}else{
				
				JOptionPane.showMessageDialog(null, "El campo TIPO PASO es obligatorio");
				
			
			
			
			
	     
		}
	}
	
	 

	public void setDescripcion_var(String text) {
		descripcion = text;
	}
	public void setResultado_esperado(String text) {
		resultado_esperado = text;
	}
	
	

	
}
