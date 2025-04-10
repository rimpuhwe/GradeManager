import java.util.Arrays;

public class GradeManager {
    //changing the datatype into a wrapper class form double to Double
    private Double[] marks;
    private double sum;
    //constructor
    GradeManager(Double...marks){
        this.marks = marks;
    }
    //adding grades functionality
    public  void sumOfMarks(){
        // to use reduce method , we convert first array into stream
        this.sum = Arrays.stream(marks).reduce((double) 0,(a, b) -> a + b);
        System.out.println("The total of marks: " + sum);
    }
    // sorting out the marks

    public void ascendingSortedMarks (){
        Arrays.sort(marks);
        System.out.println("Marks: " + Arrays.toString(marks));
    }
    public void descendingSortedMarks (){
        Arrays.sort(marks, (a,b)-> Double.compare(b, a));
        System.out.println("Marks: " + Arrays.toString(marks));
    }




}
