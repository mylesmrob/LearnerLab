import learner.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person person = new Person(123,"Bob");
        Assert.assertEquals("Expect 123",123,person.getId());
        Assert.assertEquals("Expect Bob","Bob",person.getName());
    }

    @Test
    public void testSetName(){
        Person person = new Person(987,"Mike");
        String expected = "Sam";
        person.setName("Sam");
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }
}
