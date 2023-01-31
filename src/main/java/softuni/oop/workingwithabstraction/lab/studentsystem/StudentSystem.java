package softuni.oop.workingwithabstraction.lab.studentsystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentRepo;

    public StudentSystem() {
        this.studentRepo = new HashMap<>();
    }

    public void ParseCommand(String[] args) {
        String command = args[0];
        String name = args[1];

        if (command.equals("Create")) {
            int age = Integer.parseInt(args[2]);

            double grade = Double.parseDouble(args[3]);

            if (!studentRepo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentRepo.put(name, student);
            }
        } else if (command.equals("Show")) {
            Student student = studentRepo.get(name);

            if (student != null) {
                student.studentInfo();
            }
        }
    }
}
