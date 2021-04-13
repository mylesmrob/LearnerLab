package learner;

public class Student extends Person implements ILearner{
    double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numOfHours) {
        totalStudyTime += numOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
