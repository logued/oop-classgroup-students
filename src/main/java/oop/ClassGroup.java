package oop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassGroup defines a reference to a Map of Students.
 * This implements the 1:M relationship, because one ClassGroup can have many Students
 * This is what is called "composition" in OOP.
 * The ClassGroup 'has a' list of students (in a Map)
 * (The String 'id' is also part of teh composition, as a ClassGroup 'has an' id.)
 */
public class ClassGroup {

    private String id;  // e.g. SD2a
    private Map<String,Student> students;   // list of students in this class group

    public ClassGroup(String id) {
        this.id = id;
        students = new HashMap<>();
    }

    // add a Student to this class group
    public void addStudent( Student student ) {
        students.put(student.getId(),student);  // use student id as Key, and Student object as value
    }

    public void removeStudent() {
        //TODO complete code
    };

    public Map getStudents() {
        return students;    // return reference to the students Map
    }

    public Student getStudentById(String id) {
        return students.get(id);    // return student object or null if not found
    }

    @Override
    public String toString() {
        return "ClassGroup{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
