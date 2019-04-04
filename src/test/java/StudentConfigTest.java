import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentConfig.class)
public class StudentConfigTest {

    @Autowired @Qualifier("students")
    public Students currentStudents;

    @Autowired @Qualifier("previousStudents")
    public Students previousStudents;


    @Test
    public void currentStudentsTest() {
        //Given
        String expected =
                "Id: 1, Name: Kate\n" +
                "Id: 2, Name: Thao\n";
        //When
        String actual =currentStudents.toString();
    }

    @Test
    public void previousStudentsTest() {
        //Given
        String expected =
                "Id: 3, Name: Bob\n" +
                        "Id: 4, Name: Betty\n";
        //When
        String actual =previousStudents.toString();
    }
}
