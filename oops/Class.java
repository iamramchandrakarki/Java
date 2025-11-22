class Student {
    String name;
    int age;
    int id;

    void study(){
        System.out.println("Student is Studing...");
    }

    void play(){
        System.out.println("Student is playing...");
    }

}

public class Class{
    public static void main(String[] args){
        Student s = new Student();

        s.study();
        s.play();
    }
}
