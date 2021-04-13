package learner;

public final class Instructors extends People<Instructor>{

    public static final Instructors INSTANCE = new Instructors();
    Instructor instructorA = new Instructor(123,"Paul");
    Instructor instructorB = new Instructor(987,"Tom");
    Instructor instructorC = new Instructor(456,"Sally");

    private Instructors(){
        personList.add(instructorA);
        personList.add(instructorB);
        personList.add(instructorC);
    }

    public static Instructors getInstance(){
        if(INSTANCE == null){
            synchronized ((Instructors.class)){
                if(INSTANCE == null){
                    Instructors INSTANCE = new Instructors();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return getInstance().toArray();
    }
}
