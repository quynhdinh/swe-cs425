package org.miu.cs.cs425.studentmgmt;

import org.miu.cs.cs425.studentmgmt.model.Classroom;
import org.miu.cs.cs425.studentmgmt.model.Student;
import org.miu.cs.cs425.studentmgmt.model.Transcript;
import org.miu.cs.cs425.studentmgmt.service.ClassroomService;
import org.miu.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class MyStudentMgmtApp implements CommandLineRunner {

    private final StudentService studentService;
    private final ClassroomService classroomService;

    public MyStudentMgmtApp(StudentService studentService, ClassroomService classroomService) {
        this.studentService = studentService;
        this.classroomService = classroomService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var anna = new Student(null, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, "2019-05-24");
        var annaSaved = studentService.saveStudent(anna);
        System.out.println("Anna saved: " + annaSaved);
        var student = studentService.getStudentById(annaSaved.getStudentId());
        System.out.println("Student saved: " + student);
//		 part 2: persisting a student-and-transcript object data
        var csTranscript = new Transcript(null, "BS Computer Science");
        var bob = new Student(null, "000-61-0002", "Bob", "", "Galverston", 2.87, "2019-05-24");
        bob.setTranscript(csTranscript);
        var bobSaved = studentService.saveStudent(bob);
        System.out.println("Saved bob: " + bobSaved);
//		now a student to classroom is one to many
        var m105 = new Classroom(null, "McLaughlin Building", "M105");
        var savedClassroom = classroomService.saveClassroom(m105);
        
        // Fetch the managed entities and assign them to the classroom
        var freshAnna = studentService.getStudentById(annaSaved.getStudentId());
        var freshBob = studentService.getStudentById(bobSaved.getStudentId());
        
        // Add students to classroom using the addStudent method
        savedClassroom.addStudent(freshAnna);
        savedClassroom.addStudent(freshBob);
        
        // Save the updated students (which will update their classroom reference)
        studentService.saveStudent(freshAnna);
        studentService.saveStudent(freshBob);
    }
}
