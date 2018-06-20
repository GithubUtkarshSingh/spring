package com.nt.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class SetterInjectionTest
{
	public static void main(String[] args) 
	{
	   System.out.println("Main Class:");
	   Resource res=null;
	   BeanFactory factory=null;
	   Object obj=null;
	   WishGenerator wg=null,wg1=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		System.out.println("SpringBean cfg file is located");
		factory=new XmlBeanFactory(res);
		System.out.println("IOC Container of type BeanFactory Created");
		obj=factory.getBean("wish");
		System.out.println("taget class obj injected with Depedent class obj is gathered");
		System.out.println("------------------------------");
		wg=(WishGenerator)obj;
		System.out.println("Wish Message:::::"+wg.generateWishMessage("raja"));
	
	}
}