import org.junit.Assert;
import org.junit.Test;
import people.ITeacher;
import people.Instructor;
import people.Person;
import people.Student;

public class TestInstructor {

    @Test
    public void testInstuctorisAPerson() {
        Instructor teacher = new Instructor(122);

        Assert.assertTrue(teacher instanceof Person);
    }

    @Test
    public void testInstructorInheritance (){
        Instructor instructor = new Instructor(1223);
        Assert.assertTrue(instructor instanceof ITeacher);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(122);
        Student stud = new Student(1);

        instructor.teach(stud, 4);
        double expected = 4;

        double actual = stud.getTotalStudytime();

        Assert.assertEquals(expected,actual,0);
    }

}
