import learner.ILearner;
import learner.Person;
import learner.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(123,"Bob",12.5);
        Assert.assertTrue(student instanceof ILearner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(987,"Mike",5.0);
        Assert.assertTrue(student instanceof Person);
    }
}
