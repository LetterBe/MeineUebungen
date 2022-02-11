package de.neuefische.studentdb.studentasclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StudentDBForClassesTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        List<Student> students = Arrays.asList(new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus"));
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        List<Student> actual = studentDB.list();

        // then
        Assertions.assertEquals(students, actual);

        Assertions.assertEquals(1, actual.get(0).getId());
        Assertions.assertEquals("André Schreck", actual.get(0).getName());
    }


    @Test
    void shouldReturnRandomStudent() {
        // given
        List<Student> students = Arrays.asList( new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus"));
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        Student student = studentDB.randomStudent();

        // then
        Assertions.assertNotNull(student);
    }
    /*
    @Test
    void shouldReturnStringRepresentation() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals("[{id: 1, name: André Schreck}, {id: 2, name: Thomas Kittlaus}]", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck") };
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        studentDB.add(new Student(2, "Thomas Kittlaus"));
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        studentDB.remove(0);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new Student(2, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new Student(1, "André Schreck") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = { new Student(1, "André Schreck"), new Student(2, "Max Mustermann"), new Student(3, "Thomas Kittlaus") };
        StudentDBForClasses studentDB = new StudentDBForClasses(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new Student(1, "André Schreck"), new Student(3, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }
     */

}
