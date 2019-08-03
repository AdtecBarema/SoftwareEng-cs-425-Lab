package edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
