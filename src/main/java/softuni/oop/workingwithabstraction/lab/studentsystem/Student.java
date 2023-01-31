package softuni.oop.workingwithabstraction.lab.studentsystem;

public class Student {
    private final String name;
    private final int age;
    private final double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void studentInfo() {
        String view = String.format("%s is %s years old.", name, age);

        if (grade >= 5.00) {
            view += " Excellent student.";
        } else if (grade < 5.00 && grade >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }

        System.out.println(view);
    }
}
