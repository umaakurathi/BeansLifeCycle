package test;

import java.io.File;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.Resource;
/*import org.springframework.beans.factory.xml.XmlBeanFactory;*/
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import beans.Test;

public class Client {
	public static void main(String[] args) {
		//find xml
		/*File f = File.separator();*/
		File file = new File("resources" + File.separator +"spring.xml");
		String stringfilepath = file.toString();
		/*ApplicationContext apctxt = new ClassPathXmlApplicationContext(stringfilepath);
		apctxt.getBean("t");*/
		Resource r =   new ClassPathResource(stringfilepath);
		//load xml into container
		BeanFactory factory = new XmlBeanFactory( r);
		//create test class object
		Object o1 =factory.getBean("t");
		Object o2=factory.getBean("t");
		Object o3 =factory.getBean("t");
		System.out.println(o1==o2);
		System.out.println(o2==o3);
		Test t = (Test)o1;
		t.hello("durga");
		
	}

}
