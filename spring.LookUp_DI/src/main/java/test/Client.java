package test;

import java.io.File;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.Resource;
/*import org.springframework.beans.factory.xml.XmlBeanFactory;*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import beans.Bus;
import beans.Car;
import beans.Engine;
import beans.Truck;


public class Client {
	public static void main(String[] args) {
		//find xml
		ApplicationContext apctxt = new ClassPathXmlApplicationContext("resources/spring.xml");
		System.out.println("----car----");
		Car c1 = (Car)apctxt.getBean("c");
		System.out.println(c1.getClass().getCanonicalName());
		System.out.println(c1.myCarEngine().getName());
		System.out.println("----bus----");
		Bus b = (Bus)apctxt.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getName());
		System.out.println("----truck----");
		Truck t = (Truck)apctxt.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTruckEngine().getName());
		
		
		
	}

}

