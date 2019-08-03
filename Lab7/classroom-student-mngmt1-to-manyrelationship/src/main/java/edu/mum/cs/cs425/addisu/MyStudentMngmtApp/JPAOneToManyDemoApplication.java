package edu.mum.cs.cs425.addisu.MyStudentMngmtApp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Classroom;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Student;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository.ClassroomRepository;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository.StudentRepository;

@SpringBootApplication
public class JPAOneToManyDemoApplication implements CommandLineRunner {

	@Autowired
	ClassroomRepository classroomRepo;

	// @Autowired
	StudentRepository studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(JPAOneToManyDemoApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {

		// save a couple of students into class classA
		Classroom classA = new Classroom("McLaglen", "M-115");
		Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 05, 24));
		s1.setClassroom(classA);
		classA.getStudent().add(s1);

		classroomRepo.save(classA);

	}
}