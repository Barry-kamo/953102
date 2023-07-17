import java.util.ArrayList;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the integers
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter some integers:");
        while (scanner.hasNextLine()) {
            String Strint = scanner.nextLine();
            if(Strint.length()==0||Strint==null){
                break;}
                else{
            System.out.println("Enter some integers:");
            int IntNumber = Integer.valueOf(Strint);
            numbers.add(IntNumber);}
        }
        scanner.close();
        // Perform the bubble sort to sort the numbers in descending order
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                }
            }
        // Print the sorted numbers
        System.out.println("Sorted numbers in descending order:");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}