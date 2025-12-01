// class Demo{
//     static int a, b, c;
//     int x, y, z; // Instance Variable : Memory is created when we create object
//
//     static {
//         System.out.println("Static init block: ");
//         a = 10;
//         b = 20;
//         c = 30;
//     }
//
//     static void display(){
//         System.out.println("a : " + a);
//         System.out.println("b : " + b);
//         System.out.println("c : " + c);
//     }
//
// }
// public class Static{
//     public static void main(String[] args){
//         Demo.display();
//     }
// }
//

public class Static{
    static int a;

    static {
        a = 10;
        System.out.println("This is Static block: ");
        System.out.println("a = " + a);
    }

    public static void main(String[] args){
        System.out.println("Main method");
    }
}

// First run static block and then main method
