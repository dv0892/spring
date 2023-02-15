package com.playground;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// USING XML Based Configuration
		
		//System.out.println(obj);
		
		//Using Application Context to instruct the IoC or Spring contain 
		// to load the configuration meta-data and create the bean definitions.
		//ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		
		// We can use GenericApplicationContext also
		/*GenericApplicationContext genericContext = new GenericApplicationContext();
		new XmlBeanDefinitionReader(genericContext).loadBeanDefinitions("services.xml", "daos.xml");
		genericContext.refresh();
		genericContext.getBeanFactory().registerAlias(beanName, alias);*/
		
		/*Triangle obj = context.getBean("trianleBean", Triangle.class);
		
		System.out.println(obj);
		
		
		obj.setType("Eqvilateral 1");
		
		System.out.println(obj);
		
		obj = context.getBean("trianleBean", Triangle.class);
		
		System.out.println(obj);*/
		
		
		// USING Annotation Based Configuration
		ApplicationContext context1 = new AnnotationConfigApplicationContext(ShapeConfiguration.class);
		Triangle t1 = context1.getBean("triangleBean", Triangle.class);
		System.out.println( t1.type + " " + t1.point.x);
		
		Triangle t2 = context1.getBean("triangleBean", Triangle.class);
		System.out.println( t2.type + " " + t2.point.x);
		
		t1.type = "H";
		t1.point.x = 8;
		
		System.out.println( t1.type + " " + t1.point.x);
		System.out.println( t2.type + " " + t2.point.x);
		
	}
	

}
