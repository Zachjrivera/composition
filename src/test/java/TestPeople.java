import org.junit.Assert;
import org.junit.Test;
import people.People;
import people.Person;

public class TestPeople {

    @Test
    public void addTest(){
        People people = new People();
        Person zach = new Person(1);
        Person curly = new Person(2);
        zach.setName("Zach");
        curly.setName("Curly");
        people.add(zach);
        people.add(curly);

        int expected = 2;

        int actual = people.getCount();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest(){
        People people = new People();
        Person zach = new Person(1);
        Person curly = new Person(2);
        zach.setName("Zach");
        curly.setName("Curly");
        people.add(zach);
        people.add(curly);
        people.remove(zach);
        int expected = 1;

        int actual = people.getCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        People people = new People();
        Person troy = new Person(102);
        troy.setName("Troy");
        Person timmy = new Person(103);
        timmy.setName("Timmy");
        people.add(troy);
        people.add(timmy);
        Person expected = troy;

        Person actual = people.findID(102);

        Assert.assertEquals(expected,actual);
    }



}
