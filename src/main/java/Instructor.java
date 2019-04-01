import java.util.List;

public class Instructor extends Person implements Teacher {

    public Instructor(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(List<? extends Learner> learners, double numberOfHours) {
        double hoursPerLearner = numberOfHours / learners.size();
        for (Learner learner : learners) {
            teach(learner, hoursPerLearner);
        }
    }
}
