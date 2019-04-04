import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InstructorsTest {


    @Test
    public void lectureTest() {
        //Given
        Student s1 = new Student(1, "Kate", 0.0);
        Student s2 = new Student(2, "Thao", 0.0);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        int s1hoursExpected = 1200;
        int s2hoursExpected = 1200;
        Instructor i1 = new Instructor(101, "Kris");
        //When
        i1.lecture(list, 2400);
        //Then
        Assert.assertEquals(s1hoursExpected, s1.getTotalStudyTime(), .001);
        Assert.assertEquals(s2hoursExpected, s2.getTotalStudyTime(), .001);
    }

    @Test
    public void executeBootcampTest() {
        //Given
        Instructors instructors = new Instructors();
        Instructor i1 = new Instructor(101, "Kris");
        Instructor i2 = new Instructor(102, "Leon");
        instructors.add(i1);
        instructors.add(i2);

        Students students = new Students();
        Student s1 = new Student(1, "Kate", 0.0);
        Student s2 = new Student(2, "Thao", 0.0);
        students.add(s1);
        students.add(s2);

        Alumni a = new Alumni(instructors, students);

        //When
        a.executeBootcamp();
        String expected = "Name: Kate, Hours: 1200.0\n" +
                "Name: Thao, Hours: 1200.0\n";
        //When
        String hoursPerStudent = "";
        for (Student student : students.findAll()) {
            hoursPerStudent += "Name: " + student.getName() +
                    ", Hours: " + student.getTotalStudyTime() + "\n";
        }
        String actual = hoursPerStudent;

        //Then
        Assert.assertEquals(expected, actual);
    }
}
