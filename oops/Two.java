class Calculator{
    int num1;
    int num2;

    void add(){
        num1 = 10;
        num2 = 20;

        int result = num1 + num2;

        System.out.println(result);
    }

    void sub(int a, int b){
        num1 = a;
        num2 = b;

        int result = num1 - num2;
        System.out.println(result);
    }

    void mul(int a, int b){
        int result = a * b;

        System.out.println(result);
    }
}

public class Two{
    public static void main(String[] args){
        Calculator c = new Calculator();

        c.add();
        c.sub(10,5);
        c.mul(10,7);
    }
}
