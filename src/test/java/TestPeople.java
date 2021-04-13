import learner.People;
import learner.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    People people;

    @Test
    public void testAdd(){
        Person person = new Person(123,"Bob");
        people.add(person);
        boolean expected = true;
        boolean actual = people.contains(person);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        Person person = new Person(987,"Mike");
        people.add(person);
        people.remove(person);
        boolean expected = false;
        boolean actual = people.contains(person);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        Person person = new Person(456,"Sam");
        people.add(person);
        String expected = "Sam";
        String actual = people.findById(456).getName();
        Assert.assertEquals(expected,actual);
    }
}
