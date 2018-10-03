package people;

public class Instructor extends Person implements ITeacher{

    public Instructor(long id) {
        super(id);
    }

    public void teach(ILearner learner,double numberofhours) {
         learner.learn(numberofhours);
    }

    public void lecture(ILearner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
         for (int index = 0; index<learners.length; index++){
             learners[index].learn(numberOfHoursPerLearner);
         }
        System.out.println("Each student learns for  " + numberOfHoursPerLearner);
    }
}
