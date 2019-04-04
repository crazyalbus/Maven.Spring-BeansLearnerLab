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
@ContextConfiguration(classes = {StudentConfig.class, InstructorsConfig.class, ClassroomConfig.class})
public class ClassroomConfigTest {

    @Autowired @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void currentCohortTest() {
        //Given
        String expectedClassroom =
                "Instructors\n" +
                "----------\n" +
                "Id: 101, Name: Kris\n" +
                "Id: 102, Name: Froilan\n" +
                "Id: 103, Name: Dolio\n" +
                "Id: 104, Name: Leon\n" +
                "\nStudents\n" +
                "----------\n" +
                "Id: 1, Name: Kate\n" +
                "Id: 2, Name: Thao\n";

        //When
        String actualClassroom = currentCohort.toString();

        //Then
        Assert.assertEquals(expectedClassroom, actualClassroom);
    }
}
