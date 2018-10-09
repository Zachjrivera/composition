import org.junit.Assert;
import org.junit.Test;
import people.*;

public class TestPerson {



    @Test
   public void testConstructor() {
        Person person = new Person(1023654l);
        Long expected = 1023654l;

        long actual = person.getId();

    }
    @Test
    public void testSetName (){
        Student student= new Student(123);
        student.setName("Zach");
        double expected = 2;

        double actual = student.learn(2);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testImplemantaion (){
        Student person = new Student(1);

        Assert.assertTrue(person instanceof Person);
    }
    @Test
    public void testInheritance (){
        Student person = new Student(1);

        Assert.assertTrue(person instanceof ILearner);
    }


    @Test
    public void testLearner (){
       Student person = new Student(123);
        ((Student) person).learn(4);

        double expected = 4;

        double actual = person.getTotalStudytime();

        Assert.assertEquals(expected,actual,0);
    }




}
