package by.mlechka.students.main;

import by.mlechka.students.builder.StudentsDomBuilder;
import by.mlechka.students.builder.StudentsSaxBuilder;

public class StudentMain {
    public static void main(String[] args) {
//        StudentsSaxBuilder saxBuilder = new StudentsSaxBuilder();
//        saxBuilder.buildSetStudents("src/main/resources/students/students.xml");
//        System.out.println(saxBuilder.getStudents());

        StudentsDomBuilder domBuilder = new StudentsDomBuilder();
        domBuilder.buildSetStudents("src/main/resources/students/students.xml");
        System.out.println(domBuilder.getStudents());
    }
}
