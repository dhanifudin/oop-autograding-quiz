package id.ac.polinema.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentConstructorTest {

    @Test
    @DisplayName("Student object is created without throwing an exception")
    void objectIsCreatedSuccessfully() {
        Student s = assertDoesNotThrow(() -> new Student("2141720001", "John Doe", 3.75));
        assertNotNull(s);
    }

    @Test
    @DisplayName("A second Student object with different data is also created successfully")
    void secondObjectIsCreatedSuccessfully() {
        Student s = assertDoesNotThrow(() -> new Student("2141720002", "Jane Smith", 2.80));
        assertNotNull(s);
    }
}
