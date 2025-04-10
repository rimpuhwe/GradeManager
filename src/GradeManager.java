import java.util.Arrays;

public class GradeManager {
    //changing the datatype into a wrapper class form double to Double
    private Double[] marks;
    private double sum;

    protected   double average;


    //constructor
    GradeManager(Double... marks) {
        this.marks = marks;
    }
    public void displayMarks(){
        System.out.println("here is your marks: " + Arrays.toString(marks));

    }

    //adding grades functionality
    public void sumOfMarks() {
        // to use reduce method , we convert first array into stream
        this.sum = Arrays.stream(marks).reduce((double) 0, (a, b) -> a + b);
        System.out.println("The total of marks: " + sum);
    }
    // sorting out the marks

    public void ascendingSortedMarks() {
        Arrays.sort(marks);
        System.out.println("Marks: " + Arrays.toString(marks));
    }

    public void descendingSortedMarks() {
        Arrays.sort(marks, (a, b) -> Double.compare(b, a));
        System.out.println("Marks: " + Arrays.toString(marks));
    }

    // calculating the average for the whole marks
    public void averageMarks() {
        if (marks.length == 0) {
            throw new IllegalArgumentException("your marks array is empty \uD83E\uDD79");
        } else {
            this.average = sum / marks.length;
        }
        System.out.println("The total average marks : " + average);
    }

    // finding the highest and the lowest marks in the array

    //finding the highest
    public void highMark(){
        // wanted to explore the protected access modifier
        double max = Arrays.stream(marks).reduce(Double.MIN_VALUE, (a, b) -> Math.max(a, b));
        System.out.println("the highest marks is : " + max);
    }
    // finding the lowest
    public void LowMark(){
        // let's now replace the -> with its method reference
        double min = Arrays.stream(marks).reduce(Double.MIN_VALUE, (a, b) -> Math.min(a, b));
        System.out.println("the lowest marks is : " + min);
    }

}


