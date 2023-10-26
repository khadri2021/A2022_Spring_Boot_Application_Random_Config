package com.khadri.spring.boot.application.props.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.khadri.spring.boot.application.props.student.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private Student student;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("UUID " + student.getUuid());
		System.out.println("ID " + student.getId());
		System.out.println("NAME " + student.getName());
		System.out.println("ADMIN NUMBER " + student.getAdminNumber());
		System.out.println("SUBJECT1 " + student.getSubject1());
		System.out.println("SUBJECT2 " + student.getSubject2());
		System.out.println("TOTAL MARKS " + student.getTotalMarks());
	}

}
