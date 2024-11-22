package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
//		ApplicationContext obj = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Resource resource  = new ClassPathResource("SpringConfig.xml");
		
		BeanFactory obj = new XmlBeanFactory(resource);
		
		
		
		
		System.out.println(obj.getBean("emp"));
		
		
		
		
	}

}
