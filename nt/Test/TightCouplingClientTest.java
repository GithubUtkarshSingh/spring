package Com.nt.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import Com.nt.Beans.Flipcart;

public class TightCouplingClientTest {

	public static void main(String[] args)
	{
		BeanFactory factory=null;
		Flipcart fpkt=null;
		factory=new XmlBeanFactory(new ClassPathResource("Com/nt/cfgs/ApplicationContext.xml"));
		fpkt=factory.getBean("fpkt",Flipcart.class);
		fpkt.Shooping(new String[] {"Big Laddu","Prasad items","Ganpati Murti","Pooja Items","Pandit"});
		

	}

}
