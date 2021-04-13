package learner;

public final class Students extends People<Student>{

    public static final Students INSTANCE = new Students();
    Student studentA = new Student(123,"Bob",5.0);
    Student studentB = new Student(987,"Sam",3.5);
    Student studentC = new Student(456,"Amy",3.3);

    private Students(){
        personList.add(studentA);
        personList.add(studentB);
        personList.add(studentC);
    }

    public static Students getInstance(){
        if(INSTANCE == null){
            synchronized ((Students.class)){
                if(INSTANCE == null){
                    Students INSTANCE = new Students();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return getInstance().toArray();
    }
}
