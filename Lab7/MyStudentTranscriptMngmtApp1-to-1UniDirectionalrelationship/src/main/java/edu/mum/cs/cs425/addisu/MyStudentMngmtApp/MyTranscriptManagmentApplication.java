/*
 * package edu.mum.cs.cs425.addisu.MyStudentMngmtApp;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication;
 * 
 * import edu.mum.cs.cs425.addisu.MyStudentMngmtApp.model.Transcript; import
 * edu.mum.cs.cs425.addisu.MyStudentMngmtApp.repository.TranscriptRepository;
 * 
 * @SpringBootApplication public class MyTranscriptManagmentApplication
 * implements CommandLineRunner{
 * 
 * @Autowired TranscriptRepository transcript;
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(MyTranscriptManagmentApplication.class, args); }
 * 
 * 
 * @Override public void run(String... args) throws Exception { // TODO
 * Auto-generated method stub Transcript trans1= new Transcript(1l,
 * "BS Computer Science"); Transcript savedTranscript=saveTranscript(trans1);
 * System.out.println(savedTranscript+ ", is addded to the transcripts table");
 * 
 * } Transcript saveTranscript(Transcript t) { return transcript.save(t); } }
 */