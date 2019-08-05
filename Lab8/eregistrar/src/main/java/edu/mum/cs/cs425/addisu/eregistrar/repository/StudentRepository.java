package edu.mum.cs.cs425.addisu.eregistrar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.addisu.eregistrar.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findStudentByFirstNameOrLastName(String fname, String ln);
}