package de.neuefische.studentdb.studentasclass;

import java.util.Arrays;
import java.util.List;

public class StudentDBForClasses {

    private List<Student> students;


    public StudentDBForClasses( List<Student> inseredStudents) {
        this.students = inseredStudents;
    }

    public List<Student> list() {
        return students;
    }

    public Student randomStudent() {
        int maxIndex = students.size() - 1;
        return students.get((int) (Math.random() * maxIndex));
    }

    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < students.size(); i++) {
            result += students.get(i);
            if (i < students.size() -1)  {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }

    public void add(Student newStudent) {
        /*
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = newStudent;
        this.students = newStudents;
        */
         students.add(newStudent);

    }



    public void remove(int i) {
        /*
        Student[] newStudents = Arrays.copyOf(students, students.length - 1);
        System.arraycopy(students, 0, newStudents, 0, i);
        System.arraycopy(students, i + 1, newStudents, i, students.length - (i + 1));
        this.students = newStudents;
         */
        students.remove(i);
    }


}
