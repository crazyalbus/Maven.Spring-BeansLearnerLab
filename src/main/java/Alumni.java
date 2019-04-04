import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    Instructors instructors;
    Students previousStudents;
    int totalNumberOfHoursPerStudent;

    @Autowired
    public Alumni(Instructors instructors, Students previousStudents) {
        this.instructors = instructors;
        this.previousStudents = previousStudents;
        this.totalNumberOfHoursPerStudent = 1200;
    }

    @PostConstruct
    public void executeBootcamp() {
        int totalInstructorHours = totalNumberOfHoursPerStudent * previousStudents.size();

        for (Instructor instructor : instructors.findAll()) {
            instructor.lecture(previousStudents.findAll(), totalInstructorHours / instructors.size());
        }
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public int getTotalNumberOfHours() {
        return totalNumberOfHoursPerStudent;
    }

    public void setTotalNumberOfHours(int totalNumberOfHours) {
        this.totalNumberOfHoursPerStudent = totalNumberOfHours;
    }
}
