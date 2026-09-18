package id.ac.polinema.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentGetterTest {

    @Test
    @DisplayName("getStudentId() returns the id passed to the constructor")
    void testGetStudentId() {
        Student s = new Student("2141720001", "John Doe", 3.75);
        assertEquals("2141720001", s.getStudentId());
    }

    @Test
    @DisplayName("getName() returns the name passed to the constructor")
    void testGetName() {
        Student s = new Student("2141720001", "John Doe", 3.75);
        assertEquals("John Doe", s.getName());
    }

    @Test
    @DisplayName("getGpa() returns the gpa passed to the constructor")
    void testGetGpa() {
        Student s = new Student("2141720001", "John Doe", 3.75);
        assertEquals(3.75, s.getGpa(), 0.0001);
    }
}
