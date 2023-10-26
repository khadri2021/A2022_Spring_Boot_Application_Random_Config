package com.khadri.spring.boot.application.props.student;

import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("std")
public class Student {

	private UUID uuid;

	private Integer id;

	private String name;

	private Long adminNumber;

	private String libraryPassword;

	private Integer subject1;

	private Integer subject2;

	private Integer totalMarks;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAdminNumber() {
		return adminNumber;
	}

	public void setAdminNumber(Long adminNumber) {
		this.adminNumber = adminNumber;
	}

	public String getLibraryPassword() {
		return libraryPassword;
	}

	public void setLibraryPassword(String libraryPassword) {
		this.libraryPassword = libraryPassword;
	}

	public Integer getSubject1() {
		return subject1;
	}

	public void setSubject1(Integer subject1) {
		this.subject1 = subject1;
	}

	public Integer getSubject2() {
		return subject2;
	}

	public void setSubject2(Integer subject2) {
		this.subject2 = subject2;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

}
