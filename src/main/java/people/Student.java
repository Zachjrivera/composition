package people;

public class Student extends Person implements ILearner {

   private double totalStudytime;

    public Student(long id) {
        super(id);
    }

    public void learn(double numberofhours) {

        this.totalStudytime += numberofhours;

    }

    public double getTotalStudytime (){
        return totalStudytime;
    }

    public void setTotalStudytime(double totalStudytime) {
        this.totalStudytime = totalStudytime;
    }
}
