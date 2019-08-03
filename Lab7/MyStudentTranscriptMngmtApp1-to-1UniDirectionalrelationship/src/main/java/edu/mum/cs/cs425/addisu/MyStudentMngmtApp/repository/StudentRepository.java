package edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findStudentsByCgpaGreaterThan(double cgpa);	
	

}
