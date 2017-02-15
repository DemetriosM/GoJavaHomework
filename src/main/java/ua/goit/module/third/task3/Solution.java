package ua.goit.module.third.task3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(new Date(10000000), "Java");
        Course course2 = new Course(new Date(20000000), "HTML + CSS");
        Course course3 = new Course(80, "SQL", "John Wayne");
        Course course4 = new Course(120, "JavaScript", "Harry Potter");
        Course course5 = new Course(240, "C#", "Bill Gates");

        Course[] coursesTaken1 = new Course[2];
        coursesTaken1[0] = course1;
        coursesTaken1[1] = course3;
        Course[] coursesTaken2 = new Course[3];
        coursesTaken2[0] = course2;
        coursesTaken2[1] = course4;
        coursesTaken2[2] = course5;

        Student student1 = new Student("Tom", "Cruise", 3);
        Student student2 = new Student("Willis", coursesTaken1);

        CollegeStudent collegeStudent1 = new CollegeStudent("Vladimir", "Zelensky", 4);
        CollegeStudent collegeStudent2 = new CollegeStudent("Pysanka", coursesTaken2);
        CollegeStudent collegeStudent3 = new CollegeStudent("Irina", "Volkova", 18, 3, coursesTaken1, "DTK", 95, 111111);

        SpecialStudent specialStudent1 = new SpecialStudent("Igor", "Kondratyuk", 5);
        SpecialStudent specialStudent2 = new SpecialStudent("Adele", coursesTaken2);
        SpecialStudent specialStudent3 = new SpecialStudent(123456789);
    }
}
