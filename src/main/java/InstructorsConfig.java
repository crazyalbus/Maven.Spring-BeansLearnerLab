import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    private Instructors tcUsaInstructors = new Instructors(
            new Instructor(101, "Kris"),
            new Instructor(102, "Froilan")
    );

    private Instructors tcUkInstructors = new Instructors(
            new Instructor(103, "Dolio"),
            new Instructor(104, "Leon")
    );

    @Bean
    public Instructors tcUsaInstructors(){
        return tcUsaInstructors;
    }

    @Bean
    public Instructors tcUkInstructors(){
        return tcUkInstructors;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        Instructors allInstructors = new Instructors();
        allInstructors.addAllPeople(tcUsaInstructors.findAll());
        allInstructors.addAllPeople(tcUkInstructors.findAll());
        return allInstructors;
    }
}
