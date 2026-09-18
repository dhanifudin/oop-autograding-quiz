package id.ac.polinema.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentGpaTest {

    @Test
    @DisplayName("GPA exactly 3.5 -> Cum Laude")
    void gpaLowerBoundCumLaude() {
        Student s = new Student("2141720001", "John Doe", 3.5);
        assertEquals("Cum Laude", s.getPredicate());
    }

    @Test
    @DisplayName("GPA 3.49 -> Very Satisfactory")
    void gpaBelowCumLaude() {
        Student s = new Student("2141720002", "Jane Smith", 3.49);
        assertEquals("Very Satisfactory", s.getPredicate());
    }

    @Test
    @DisplayName("GPA exactly 3.0 -> Very Satisfactory")
    void gpaLowerBoundVerySatisfactory() {
        Student s = new Student("2141720003", "Alan Turing", 3.0);
        assertEquals("Very Satisfactory", s.getPredicate());
    }

    @Test
    @DisplayName("GPA 2.99 -> Satisfactory")
    void gpaBelowVerySatisfactory() {
        Student s = new Student("2141720004", "Ada Lovelace", 2.99);
        assertEquals("Satisfactory", s.getPredicate());
    }
}
