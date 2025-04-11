import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        GradeManager scores = new GradeManager(5.8, 46.9, 8.0, 23.18, 98.7, 0.45);

        System.out.println("Welcome to the App that manages your Marks ");
        Thread.sleep(2000);

        while (true) {
            System.out.println("******************");
            System.out.println("MENU");
            System.out.print("""
                     1. Show your Marks
                     2. Total Sum
                     3. Calculating the average
                     4. Your Marks in Order
                     5. Display the Highest/Lowest Marks
                     6. Search Marks by Index
                     7. Exit
                    """);
            System.out.println("*********************");
            System.out.print("Enter your choice: ");

            // Validate input choice
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Processing ...");
                    scores.displayMarks();
                    break;

                case 2:
                    scores.sumOfMarks();
                    break;
                case 3:
                    scores.averageMarks();
                    break;
                case 4: {
                    scanner.nextLine(); // Clearing the buffer
                    System.out.print("In which order do you want (ascending / descending): ");
                    String order = scanner.nextLine();

                    if (order.equalsIgnoreCase("ascending")) {
                        scores.ascendingSortedMarks();
                    } else if (order.equalsIgnoreCase("descending")) {
                        scores.descendingSortedMarks();
                    } else {
                        System.out.println("Invalid input! Please enter 'ascending' or 'descending'.");
                    }
                    break;
                }

                case 5: {
                    scanner.nextLine();
                    System.out.print("Do you want the 'highest' or 'lowest' marks? ");
                    String highLow = scanner.nextLine();

                    if (highLow.equalsIgnoreCase("highest")) {
                        scores.highMark();
                    } else if (highLow.equalsIgnoreCase("lowest")) {
                        scores.LowMark();
                    } else {
                        System.out.println("Invalid input! Please enter 'highest' or 'lowest'.");
                    }
                    break;
                }
                case 6:
                    System.out.print("Enter the index of the mark you want to search: ");
                    int index = scanner.nextInt();
                    scores.searchMarkByIndex(index);
                    break;
                case 7:
                    System.out.println("THANK YOU FOR HAVING FUN WITH US");
                    return;

                default:
                    System.out.println("Wrong choice! Please select a valid option from the menu.");
            }
        }
    }
}
