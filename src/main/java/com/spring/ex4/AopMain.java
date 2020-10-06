package com.spring.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class AopMain {

	public static void main(String[] args) {
		
		/*
		StudentImpl si = new StudentImpl();
		si.setName("Á¤¼®");
		si.getStudentInfo();
		 */
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("aopExam.xml");
		
		
		Student std = (Student) context.getBean("std");	
		
		std.getStudentInfo();
		
		
		System.out.println("-----------------------");
		Worker wor = (Worker) context.getBean("wor");	
		wor.getWorkerInfo();
	}

}
