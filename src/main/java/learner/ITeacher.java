package learner;

public interface ITeacher {

    void teach (ILearner learner, double numOfHours);
    void lecture (ILearner[] learners, double numOfHours);
}
