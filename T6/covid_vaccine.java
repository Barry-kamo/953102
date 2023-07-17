import java.util.ArrayList;

class CovidVaccine {
    int SID; //学生ID
    String first_name; //名字
    String last_name; //姓氏
    ArrayList<String> previous_vaccines; 
    public CovidVaccine(int SID, String first_name, String last_name, ArrayList<String> previous_vaccines) {
        this.SID = SID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.previous_vaccines = previous_vaccines;
      }
    
      //重写toString方法，方便打印对象信息
      public String toString() {
        return "SID: " + SID + ", Name: " + first_name + " " + last_name + ", Previous vaccines: " + previous_vaccines;
    }
}
    