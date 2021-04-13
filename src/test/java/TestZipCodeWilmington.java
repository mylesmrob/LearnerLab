import learner.*;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testLecture(){
        ZipCodeWilmington zip = ZipCodeWilmington.getInstance();
        Instructors instructors = Instructors.getInstance();
        zip.hostLecture(instructors.findById(123),6.0);
        Student studentA = new Student(123,"Bob",5.0);
        Student studentB = new Student(987,"Sam",3.5);
        Student studentC = new Student(456,"Amy",3.3);
        Assert.assertEquals(7.0,studentA.getTotalStudyTime(),0);
        Assert.assertEquals(5.5,studentB.getTotalStudyTime(),0);
        Assert.assertEquals(5.3,studentC.getTotalStudyTime(),0);
    }
}
