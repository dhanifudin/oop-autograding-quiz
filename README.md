# OOP Assignment — Student Class

## Description

Complete the `Student` class in `src/main/java/id/ac/polinema/oop/Student.java` per the specification below.

### Fields

| Field     | Type   |
|-----------|--------|
| studentId | String |
| name      | String |
| gpa       | double |

### Constructor

```java
public Student(String studentId, String name, double gpa)
```

Stores all three parameters into their respective fields.

### Methods

| Method            | Return   | Description                        |
|-------------------|----------|-------------------------------------|
| `getStudentId()`  | `String` | Returns studentId                   |
| `getName()`       | `String` | Returns name                        |
| `getGpa()`        | `double` | Returns gpa                         |
| `getPredicate()`  | `String` | Graduation predicate (see rules)    |

### Predicate Rules

| Condition          | Predicate            |
|--------------------|------------------------|
| `gpa >= 3.5`       | `"Cum Laude"`          |
| `3.0 <= gpa < 3.5` | `"Very Satisfactory"`  |
| `gpa < 3.0`        | `"Satisfactory"`       |

## How It Works

1. Clone the assignment repository from GitHub Classroom.
2. Edit `src/main/java/id/ac/polinema/oop/Student.java`, remove the `throw new UnsupportedOperationException(...)` lines and complete the code per each TODO.
3. Test locally:
   ```bash
   mvn test
   ```
4. Commit and push. Every push automatically triggers autograding.

## Grading

Total **100 points**, split across 3 test groups (run via GitHub Actions):

| Test Group           | Points |
|-----------------------|--------|
| Constructor Test      | 40     |
| Getter Test            | 30     |
| GPA Predicate Test     | 30     |

Scores appear in the repository's **Actions** tab and are automatically reported to the GitHub Classroom dashboard.

## Rules

- **Do not modify** any files under `src/test/**` or `.github/**`.
- Do not change the class name, method names, or method signatures in `Student.java`.
