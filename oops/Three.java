class AdditionCalc {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(int a, double b){
        return a + b;
    }

    double add(double a, double b, double c){
        return a + b;
    }
}

public class Three{
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 30;

        double a = 10.5;
        double b = 20.5;
        double c = 30.5;

        AdditionCalc cal = new AdditionCalc();

        int result = cal.add(x,y);
        System.out.println(result);
    }
}
