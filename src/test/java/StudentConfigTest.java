import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired @Qualifier(name = "students")
    public Students currentStudents;

    @Autowired @Qualifier(name = "previousStudents")
    public Students previousStudents;


    @Test
    public void currentStudentsTest() {
        //Given
        String expected =
                "Id: 1, Name: Kate\n" +
                "Id: 2, Name: Thao\n";
        //When
        String actual =
    }
}
