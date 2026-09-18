package id.ac.polinema.oop;

/**
 * Student class.
 *
 * TASK: Complete every section marked TODO below.
 * Do not change the class name, method names, or method signatures —
 * the autograder calls them exactly as defined here.
 */
public class Student {

    // TODO: add fields: studentId (String), name (String), gpa (double)

    /**
     * Student constructor.
     *
     * @param studentId Student identification number
     * @param name      Student's full name
     * @param gpa       Grade Point Average (0.0 - 4.0)
     */
    public Student(String studentId, String name, double gpa) {
        // TODO: store parameters into fields
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getStudentId() {
        // TODO: return studentId
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getName() {
        // TODO: return name
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public double getGpa() {
        // TODO: return gpa
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Determines the graduation predicate based on GPA:
     * - gpa >= 3.5           -> "Cum Laude"
     * - 3.0 <= gpa < 3.5     -> "Very Satisfactory"
     * - gpa < 3.0            -> "Satisfactory"
     *
     * @return graduation predicate
     */
    public String getPredicate() {
        // TODO: implement the predicate logic per the rules above
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
