class Demo{
    static int a;
    static {
        a = 4;
        System.out.println("a = " + a);
    }

    public static void display(){
        System.out.println("Display block: ")
        System.out.println(a);
    }

}
public class StaticFive{
    public static void main(String[] args){
        Demo d = new Demo();
        Demo.display();
        d.display();
    }
}
