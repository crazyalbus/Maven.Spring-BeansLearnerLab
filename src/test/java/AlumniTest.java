import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {StudentConfig.class, InstructorsConfig.class})
public class AlumniTest {

    @Autowired @Qualifier("instructors")
    Instructors instructors;

    @Autowired @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void executeBootcampTest() {
        //Given
        Alumni a = new Alumni(instructors, previousStudents);
        String expected = "Name: Bob, Hours: 1200.0\n" +
                "Name: Betty, Hours: 1200.0\n";
        //When
        a.executeBootcamp();
        String hoursPerStudent = "";
        for (Student student : previousStudents.findAll()) {
            hoursPerStudent += "Name: " + student.getName() +
                    ", Hours: " + student.getTotalStudyTime() + "\n";
        }
        String actual = hoursPerStudent;

        //Then
        Assert.assertEquals(expected, actual);

    }
}
