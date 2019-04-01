public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(long ID, String name, double totalStudyTime) {
        super(ID, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
