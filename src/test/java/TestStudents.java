import learner.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        Students.getInstance();
        Assert.assertEquals("Bob",Students.getInstance().findById(123).getName());
        Assert.assertEquals("Sam",Students.getInstance().findById(987).getName());
        Assert.assertEquals("Amy",Students.getInstance().findById(456).getName());
    }
}
