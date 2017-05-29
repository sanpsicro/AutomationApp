package Main;



import javax.swing.JFrame;
import javax.swing.JPanel;

import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Automation_windows.casosPrueba;
import Beans.casoPrueba;
import Beans.escenario;
import Dao.EscenarioService;
import Dao.escenariosDAO;
import Dao.escenariosImplDAO;


//ApplicationContext will be loaded from "classpath:/com/example/OrderServiceTest-context.xml"

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		escenario em = new escenario();
	    
		em.setDESCRIPCION("qweqwe");
		em.setNOMBRE("asdasd");
		EscenarioService emService = (EscenarioService) context.getBean("escenarioService");
	
		emService.persistEscenario(em);
		System.out.println("Updated age :" + emService.findEscenarioById(1));		
		em.setDESCRIPCION("323232");
		emService.updateEscenario(em);
		//emService.deleteEscenario(em);
		context.close();
	
				
}
	

		    
  
		       
	
		
		

}

