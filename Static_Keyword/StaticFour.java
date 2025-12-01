class Alien {
    static {
        System.out.println("SB1");
    }

    static {
        System.out.println("SB2");
    }

{
        System.out.println("NSB1");
    }

{
        System.out.println("NSB2");
    }

}

public class StaticFour{
    public static void main(String[] args){
        Alien a1 = new Alien();
    }
}
