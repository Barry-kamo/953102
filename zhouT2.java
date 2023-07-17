import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;



public class zhouT2 {
    public static  int FindSTUDENT(Vector v1,Vector v2,Vector v3,int A){
        char[] ABC = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int A1=0;
                for(int k=0;k<v2.size();k++){
                    if(ABC[A]==((String) v2.get(k)).charAt(0)){
                        A1++;
                        System.out.println(v1.get(k)+" "+v2.get(k)+""+v3.get(k));
                    }  
                }
    return A1;}
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/ASUS/Downloads/class_roster.csv";
        String line; 
        Vector<String> ID = new Vector();
        Vector<String> firstname = new Vector();
        Vector<String> lastname = new Vector();
        char[] ABC = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        try (FileReader fr = new FileReader(path); 
            BufferedReader reader = new BufferedReader(fr)) {
            // Skip the first 7 lines of the file
            for (int i = 0; i < 7; i++) {
                reader.readLine();
            }

            // Read the rest of the lines and store them in a list
            Vector<String> students = new Vector();
            while ((line = reader.readLine()) != null) {
                students.add(line);
            }
            // Print out the total number of students
            int total = students.size();
            System.out.println("Total students: " + total);
            //System.out.println(firstname.get(fuck).charAt(0));
            for (int i = 0; i < students.size(); i++) {
                String[] values = students.get(i).split(",");
                String studentId = values[1];
                String name = values[2];
                String firtname = values[3];
                ID.addElement(studentId);
                firstname.addElement(name);
                lastname.addElement(firtname);
            }                
        }
        int A1=0;
        for(int j=0;j<26;j++){
        for(int k=0;k<firstname.size();k++){
            if(ABC[j]==((String) firstname.get(k)).charAt(0)){
                A1++;
            }
        }
        System.out.println(ABC[j]+":"+A1);
        FindSTUDENT(ID, firstname, lastname, j);
        A1=0;
        }
        System.out.println("Program terminate properly");
    }
}