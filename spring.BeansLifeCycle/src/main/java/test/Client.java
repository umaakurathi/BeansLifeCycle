package test;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.Resource;
/*import org.springframework.beans.factory.xml.XmlBeanFactory;*/
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import beans.Test;

public class Client {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter 1 for save 2 for close");
			int i = sc.nextInt();
			switch(i) {
			case 1: Test t =(Test)cap.getBean("t");
			        System.out.println("enter id");
			        int id= sc.nextInt();
			        System.out.println("enter name");
			        String name= sc.next();
			        System.out.println("enter email");
			        String email= sc.next();
			        System.out.println("enter address");
			        String address= sc.next();
			       t.save(id, name, email, address);
			       break;
			default:cap.close(); 
					break;
			
				
			}
		}
		
	}

}
