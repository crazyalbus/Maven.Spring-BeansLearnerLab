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

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String classroom = "";
        classroom += "Instructors\n----------\n";
        for (Instructor instructor: instructors) {
            classroom += instructor.toString() + "\n";
        }
        classroom += "\nStudents\n----------\n";
        for (Student student : students) {
            classroom += student.toString() + "\n";
        }
        return classroom;
    }
}
