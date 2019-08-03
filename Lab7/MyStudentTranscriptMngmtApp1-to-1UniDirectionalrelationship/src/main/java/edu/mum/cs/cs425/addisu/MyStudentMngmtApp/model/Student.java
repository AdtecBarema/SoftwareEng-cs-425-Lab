package edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.*;

import javax.persistence.*;

@Entity
@Table (name="students")
public class Student implements Serializable {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	@NotNull
	@NotBlank
	private String studentNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private Double cgpa;
	private LocalDate dateOfEnrollment;
	
	
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL
            )
	@JoinColumn(unique = true)
   
	
	private Transcript transcript;
	
	
	
	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	public Student() {
			
	}	
	public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, Double cgpa,
			LocalDate dateOfEnrollment, Transcript ts) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
		this.transcript=ts;
		this.transcript.setStudent(this);
	}	
	
	public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName,
			Double cgpa, LocalDate dateOfEnrollment) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
				+ dateOfEnrollment + "]";
	}	
}