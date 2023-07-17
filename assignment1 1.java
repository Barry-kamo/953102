import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;


public class assignment1 {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/ASUS/Downloads/c.csv";
        String line; 
        try (FileReader fr = new FileReader(path); 
            BufferedReader reader = new BufferedReader(fr)) {
            // Read the rest of the lines and store them in a list
            Vector<String> students = new Vector();
            while ((line = reader.readLine()) != null) {
                students.add(line);
            }

            // Print out the total number of students
            int total = students.size();
            System.out.println("Total students: " + total);

            // Print out the students' information
            for (int i = 0; i < students.size(); i++) {
                String[] values = students.get(i).split(",");
                String studentId = values[0];
                String name = values[1];
                String firtname = values[2];
                System.out.println(name + " "+firtname);
                System.out.println();

            }
        }
    }
}
    
