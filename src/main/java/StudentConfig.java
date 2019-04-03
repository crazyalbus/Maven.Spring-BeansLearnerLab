import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    private Students currentStudents = new Students(
            new Student(1, "Kate", 0.0),
            new Student(2, "Thao", 0.0)
    );

    private Students previousStudents = new Students(
            new Student(3, "Bob", 1000.0),
            new Student(4, "Betty", 1000.0)
    );

    @Bean(name = "students")
    public Students currentStudents() {
        return currentStudents;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return previousStudents;
    }

}
