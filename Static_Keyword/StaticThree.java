class Student {
    int id;
    String name;
    String city;

    static int count;

    Student() {
        System.out.println("Zero param constructor");
    }

    Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        count++;
    }


}

public class StaticThree {
    public static void main(String[] args) {
        Student s = new Student(1, "Ram", "Dolakha");
        System.out.println("No of object : " + Student.count);
        
        Student s1 = new Student(2, "Shyam", "Pokhara");
        System.out.println("No of object : " + Student.count);

        Student s2 = new Student(3, "Sagar", "Kathmandu");
        System.out.println("No of object : " + Student.count);
    }
}
