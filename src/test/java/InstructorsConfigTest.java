import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InstructorsConfig.class)
public class InstructorsConfigTest {

    @Autowired @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;

    @Autowired @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void tcUsaInstructorsTest() {
        //Given
        String expected =
                "Id: 101, Name: Kris\n" +
                "Id: 102, Name: Froilan\n";
        //When
        String actual = tcUsaInstructors.toString();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tcUkInstructorsTest() {
        //Given
        String expected =
                "Id: 103, Name: Dolio\n" +
                        "Id: 104, Name: Leon\n";
        //When
        String actual = tcUkInstructors.toString();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instructorsTest() {
        //Given
        String expected =
                "Id: 101, Name: Kris\n" +
                "Id: 102, Name: Froilan\n" +
                "Id: 103, Name: Dolio\n" +
                "Id: 104, Name: Leon\n";
        //When
        String actual = instructors.toString();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
