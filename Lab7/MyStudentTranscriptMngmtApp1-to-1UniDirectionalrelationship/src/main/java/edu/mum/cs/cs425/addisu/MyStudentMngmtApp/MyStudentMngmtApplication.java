/*
 * package edu.mum.cs.cs425.addisu.MyStudentMngmtApp;
 * 
 * import java.time.LocalDate; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication;
 * 
 * import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Student; import
 * edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository.StudentRepository;
 * 
 * @SpringBootApplication public class MyStudentMngmtApplication implements
 * CommandLineRunner {
 * 
 * @Autowired StudentRepository student;
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(MyStudentMngmtApplication.class, args); }
 * 
 * @Override public void run(String... args) throws Exception { Student stu1=new
 * Student(1L, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019,
 * 05, 24)); Student savedStudent1=saveStudent(stu1); // Student stu2=new
 * Student(1L, "000-61-0002", "Keven", "McKroge", "John", 3.39,
 * LocalDate.of(2019, 05, 24)); // Student savedStudent2=saveStudent(stu2);
 * for(Student s: getTopStudents()) { System.out.println(s); }
 * 
 * }
 * 
 * Student saveStudent(Student s) { return student.save(s); }
 * 
 * List<Student> getTopStudents() { return
 * student.findStudentsByCgpaGreaterThan(3.44); } }
 */