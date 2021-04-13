import learner.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    private static final double DELTA = 1e-15;

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(123,"Sally");
        Assert.assertTrue(instructor instanceof ITeacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(987,"Ash");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(123,"Bob",12.5);
        Instructor instructor = new Instructor(987,"Ash");
        double numOfHours = 5.0;
        double expected = 17.5;
        instructor.teach(student,numOfHours);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,DELTA);
    }

    @Test
    public void testLecture(){
        Student studentA = new Student(987,"Mike",5.0);
        Student studentB = new Student(456,"Paul",2.5);
        Student[] students = {studentA,studentB};
        Instructor instructor = new Instructor(123,"Sally");
        double numOfHours = 12.0;
        double expectedA = 11.0;
        double expectedB = 8.5;
        instructor.lecture(students,numOfHours);
        double actualA = studentA.getTotalStudyTime();
        double actualB = studentB.getTotalStudyTime();
        Assert.assertEquals(expectedA,actualA,DELTA);
        Assert.assertEquals(expectedB,actualB,DELTA);
    }
}
