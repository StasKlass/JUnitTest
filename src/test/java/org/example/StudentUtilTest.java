package org.example;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StudentUtilTest {
    public String Student;
    public String getName;


    @Test
    public void testGetStudentsAbove75() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Петя", 80));
        students.add(new Student("Вася", 60));
        students.add(new Student("Димончик", 90));

        List<Student> result = StudentUtil.getStudentsAbove75(students);

        assertEquals(2, result.size());
        assertEquals("Петя", result.get(0).getName());
        assertEquals("Димончик", result.get(1).getName());
    }

}
