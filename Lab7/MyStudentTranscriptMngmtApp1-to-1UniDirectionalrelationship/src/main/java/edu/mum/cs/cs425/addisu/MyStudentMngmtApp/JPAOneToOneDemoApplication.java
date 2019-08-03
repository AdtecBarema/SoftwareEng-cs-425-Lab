package edu.mum.cs.cs425.addisu.MyStudentMngmtApp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Student;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Transcript;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository.StudentRepository;
import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository.TranscriptRepository;
@SpringBootApplication
public class JPAOneToOneDemoApplication implements CommandLineRunner {	
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	TranscriptRepository transRepo;	
	public static void main(String[] args) {
        SpringApplication.run(JPAOneToOneDemoApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		 
		// Clean all data from tables
        this.studentRepo.deleteAllInBatch();
        this.transRepo.deleteAllInBatch();      
        
        //Create a student object passing the transcript as a constructor value as parameter:
        Student withTranscript=new Student(1l, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019, 05, 24) ,new Transcript(1l, "BSC in Computer Sceience") );
        
        this.studentRepo.save(withTranscript);      	
	}
}
