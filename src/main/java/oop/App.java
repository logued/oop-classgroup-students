package oop;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementing a one-to-many relationship (1:M)
 * between ClassGroup and Student.
 * Our ClassGroup class references a map of Students, allowing us
 * to represent a "has-a" relationship. ClassGroup 'has a' student.
 * This is called "composition" in OOP.
 *
 * Each ClassGroup has many students (i.e. zero, one or many)
 */
public class App 
{
    public static void main( String[] args ) {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println( "ClassGroup and Students App" );

        ClassGroup group1 = new ClassGroup("SD1a");                 // instantiate a class group
        group1.addStudent( new Student("D00008888","Jamie"));  // add students to the class group
        group1.addStudent( new Student("D00005555","Temi"));
        group1.addStudent( new Student("D00003333","Cornelia"));

        // retrieve a student object using the id (must check for null)
        Student s1 = group1.getStudentById("D00005555");
        if( s1 != null)
            System.out.println("Student:"+s1.toString());
        else
            System.out.println("Student not found in this group.");

        Map<String,Student> map = group1.getStudents(); // get all student from the group
        for(Student s : map.values()) {                 // iterate over Values in the Map
            System.out.println(s.toString());
        }

        // create a Map (list) of class groups
        // and add new Students to each groups (ie populate the groups)
        Map<String,ClassGroup> classGroups = new HashMap<>();

        classGroups.put("SD1a",new ClassGroup("SD1a")); // Key, Value pairs
        classGroups.get("SD1a").addStudent( new Student("D00005555","Frank"));
        classGroups.get("SD1a").addStudent( new Student("D00006666","Sonia"));

        classGroups.put("SD1b",new ClassGroup("SD1b")); // class id is Key, ClassGroup is Value
        classGroups.put("SD1c",new ClassGroup("SD1c"));
        classGroups.put("SD2a",new ClassGroup("SD2a"));

    }
}
