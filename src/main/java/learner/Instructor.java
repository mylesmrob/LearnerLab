package learner;

public class Instructor extends Person implements ITeacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(ILearner learner, double numOfHours) {
        learner.learn(numOfHours);
    }

    @Override
    public void lecture(ILearner[] learners, double numOfHours) {
        double hourPerLearner = numOfHours / learners.length;
        for(ILearner l : learners){
            l.learn(hourPerLearner);
        }
    }
}
