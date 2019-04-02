import java.util.List;

public class Classroom {

List<Instructor> instructors;
List<Student> students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors.findAll();
        this.students = students.findAll();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

}
