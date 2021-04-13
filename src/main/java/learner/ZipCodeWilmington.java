package learner;
import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {
    public static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students;
    Instructors instructors;

    private ZipCodeWilmington(){
    }

    public void hostLecture(ITeacher teacher, double numOfHours){
        teacher.lecture(students.toArray(),numOfHours);
    }

    public void hostLecture(long id, double numOfHours){
        ITeacher teacher = instructors.getInstance().findById(id);
        teacher.lecture(students.toArray(),numOfHours);
    }

    public void getStudyMap(){
        Map<Student, Double> study = new HashMap<>();
        study.put(students.studentA,students.studentA.getTotalStudyTime());
        study.put(students.studentB,students.studentB.getTotalStudyTime());
        study.put(students.studentC,students.studentC.getTotalStudyTime());
    }

    public static ZipCodeWilmington getInstance(){
        if(INSTANCE == null){
            synchronized ((ZipCodeWilmington.class)){
                if(INSTANCE == null){
                    ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
                }
            }
        }
        return INSTANCE;
    }
}
