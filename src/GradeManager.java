import java.util.Arrays;

public class GradeManager {
    private double[] marks;
    //constructor
    GradeManager(double...marks){
        this.marks = marks;
    }
    //adding grades functionality
    public  void sumOfMarks(){
        double sum = Arrays.stream(marks).reduce(0,(a,b) -> a + b);
        System.out.println("The total of marks: " + sum);
    }

}
