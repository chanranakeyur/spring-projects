package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("resources/spring.xml");
		
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		
		factory.getBean("t");
		System.out.println("Document Valid");
	}
}
