import java.util.List;

public interface Teacher {
    public void teach(Learner learner, double numberOfHours);

    public void lecture(List<? extends Learner> learners, double numberOfHours);
}
