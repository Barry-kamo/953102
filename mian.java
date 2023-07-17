import java.util.ArrayList;
import java.util.Arrays;

public class mian {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

//创建一些CovidVaccine对象，用不同的参数初始化
CovidVaccine cv1 = new CovidVaccine(1001, "A", "B", new ArrayList<String>(Arrays.asList("Sinovac", "Pfizer")));
CovidVaccine cv2 = new CovidVaccine(1002, "C", "D", new ArrayList<String>(Arrays.asList("Moderna")));
CovidVaccine cv3 = new CovidVaccine(1003, "D", "E", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv4 = new CovidVaccine(1004, "F", "G", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv5 = new CovidVaccine(1005, "H", "I", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv6 = new CovidVaccine(1006, "J", "K", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv7 = new CovidVaccine(1007, "L", "M", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv8 = new CovidVaccine(1008, "N", "O", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv9 = new CovidVaccine(1009, "P", "Q", new ArrayList<String>(Arrays.asList("Sinopharm")));
CovidVaccine cv10 = new CovidVaccine(1010, "R", "S", new ArrayList<String>(Arrays.asList("Sinopharm")));
//用insert方法将CovidVaccine对象添加到链表中
list.insert(cv1);
list.insert(cv2);
list.insert(cv3);
list.insert(cv4);
list.insert(cv5);
list.insert(cv6);
list.insert(cv7);
list.insert(cv8);
list.insert(cv9);
list.insert(cv10);
list.delete(1002);
list.delete(1003);
list.traversal();
list.deleteAll();
list.traversal();
}
}
