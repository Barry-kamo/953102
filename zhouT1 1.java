import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.reflect.Array;

public class zhouT1 {
    
    public static void main(String[] args)throws FileNotFoundException {
        int size = 100;
        double sum=0;
        double mylist[][] = new double[size][size];
        StringTokenizer token;
        File f = new File("C:/Users/zhougc/Downloads/ADT/t1.csv");
        Scanner myScan=new Scanner(f);

        int i=0;
        while(myScan.hasNext()){
            String dataLine = myScan.nextLine();
            token = new StringTokenizer(dataLine,",");
            double a = Double.parseDouble(token.nextToken());
            double b = Double.parseDouble(token.nextToken());
            mylist[i][0] = a;
            mylist[i][1] = b;
            i++;
            sum=sum+a+b;
        }
        int a0=0;
            for(int x=0;x<99;x++){
            System.out.println(mylist[a0][0]);
            System.out.println(mylist[a0][1]);
            a0++;
        }
        
        System.out.println("top five of answer:");
        int y=0;
        for(int x=0;x<2;x++){
            System.out.println(mylist[y][0]);
            System.out.println(mylist[y][1]);
            y++;
        }
        System.out.println(mylist[2][0]);
        System.out.println(" ");

        System.out.println("end five row of answer:");
        int g=98;
        for(int x=0;x<2;x++){
            System.out.println(mylist[y][1]);
            System.out.println(mylist[y][0]);
            g--;
        }System.out.println(mylist[96][1]);
        System.out.println(" ");
        System.out.println("The sum= "+sum);
        System.out.println("end of program");
        myScan.close();
    }
}
