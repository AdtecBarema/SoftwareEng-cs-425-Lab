package edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//compared to CrudRepository, JpaRepository has implemented many classes

import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Transcript;
public interface TranscriptRepository extends JpaRepository<Transcript, Long> {

}
