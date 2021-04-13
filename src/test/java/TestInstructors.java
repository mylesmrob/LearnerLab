import learner.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test(){
        Instructors.getInstance();
        Assert.assertEquals("Paul", Instructors.getInstance().findById(123).getName());
        Assert.assertEquals("Tom", Instructors.getInstance().findById(987).getName());
        Assert.assertEquals("Sally", Instructors.getInstance().findById(456).getName());
    }
}
