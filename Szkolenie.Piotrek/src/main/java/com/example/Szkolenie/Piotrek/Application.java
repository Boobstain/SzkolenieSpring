package com.example.Szkolenie.Piotrek;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import java.awt.print.Book;
import java.util.stream.Stream;

@Configuration
@SpringBootApplication
@ComponentScan("Application")
public class Application implements CommandLineRunner {

@Autowired private ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}



	@Bean
	Book book(){
		return book();
	}

	@Bean
	Author author(){
		return author();
	}
	@Bean
	Write write(){
		return write();
	}
	@Bean
	MainBook mainBook(){
		return mainBook();
	}
	@Bean
	Tester tester(){
		return tester();
	}
	@Override
	public void run(String...args) throws Exception{
		String[] beanDefinitionNames=getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(s-> System.out.println("bean:"+s));
		ServletContext bean=applicationContext.getContext(String.valueOf(MyInterface.class));
		System.out.println(bean.getClass());
		
	}

	private String[] getBeanDefinitionNames() {
		return new String[0];
	}


}



