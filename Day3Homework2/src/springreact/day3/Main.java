package springreact.day3;

import springreact.day3.model.Instructor;
import springreact.day3.model.Student;
import springreact.day3.service.InstructorManager;
import springreact.day3.service.StudentManager;

public class Main {
    public static void main(String[] args) {
        String[] registeredCourses = new String[] { "Java", "React" };
        Student student = new Student(1, "Ahmet", "ÇALIŞKAN", registeredCourses);
        StudentManager studentManager = new StudentManager();
        System.out.println("-------- Öğrenci Ekleme --------");
        studentManager.add(student);
        System.out.println("\n-------- Öğrenci Silme --------");
        studentManager.delete(student);

        String[] branches = new String[] { "Java", "Angular", "React" };
        Instructor instructor = new Instructor(1, "Mehmet", "EĞİTİR", branches);
        InstructorManager instructorManager = new InstructorManager();
        System.out.println("\n-------- Eğitmen Ekleme --------");
        instructorManager.add(instructor);
        System.out.println("\n-------- Eğitmen Silme --------");
        instructorManager.delete(instructor);
    }
}
