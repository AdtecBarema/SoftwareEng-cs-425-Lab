package edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transcripts")
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transcriptId;
	private String degreeTitle;	   
	
	@OneToOne(mappedBy = "transcript") 		
    private Student student;    
    
    
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Transcript() {
		super();		
	}
	
	public Transcript(Long transcriptId, String degreeTitle) {
		super();
		this.transcriptId = transcriptId;
		this.degreeTitle = degreeTitle;
	}
	
	
	@Override
	public String toString() {
		return "Transcript [transcriptId=" + transcriptId + ", degreeTitle=" + degreeTitle + "]";
	}
	public Long getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	
	
}
