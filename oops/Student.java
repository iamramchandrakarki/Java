class School{

    int classes;
    String Subject;
    int Std;

    void Data(int classes , String Subject, int Std){
        this.classes = classes;
        this.Subject = Subject;
        this.Std = Std;
    }

    void ShowData(){
        System.out.println("Class = "+ classes +"\nSubject = "+ Subject + "\nStd = "+Std);
    }
}

public class Student{
    public static void main(String[] args){
        School s = new School();
        s.Data(5,"Math",7);
        s.ShowData();
    }
}
