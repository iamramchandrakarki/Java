class Demo {
    static int a, b, c;
    int x, y, z;

    static {
        System.out.println("Static init block : ");
        a = 10;
        b = 20;
        c = 30;
    }

    static void display() {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }

{
        x = 44;
        y = 45;
        z = 46;

        System.out.println("Java Initialization: ");

    }

    Demo() {
        System.out.println("Constructor");
    }

    void display2(){
        System.out.println("Normal Function: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
    }
}

public class StaticTwo{
    public static void main(String[] args){
        Demo.display();
        Demo d2 = new Demo();
        d2.display();

        Demo d3 = new Demo();
        d3.display2();
    }
}
