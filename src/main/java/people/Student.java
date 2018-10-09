package people;

public class Student extends Person implements ILearner {

   private double totalStudytime;

    public Student(long id) {
        super(id);
    }

    public double learn(double numberofhours) {

        this.totalStudytime += numberofhours;
        return totalStudytime;
    }

    public double getTotalStudytime (){
        return totalStudytime;
    }

    public void setTotalStudytime(double totalStudytime) {
        this.totalStudytime = totalStudytime;
    }



}
