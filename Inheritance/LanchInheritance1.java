class Aeroplane {

    void fly() {
        System.out.println("Aeroplane flies");
    }

    void landing() {
        System.out.println("Aeroplane is landing");
    }
}

class CargoPlane extends Aeroplane {

    void feat() {
        System.out.println("This is cargo plane function.");
    }

}

class PassengerPlane extends Aeroplane {
    void feat() {
        System.out.println("This is a passenger plane function.");
    }

}

public class LanchInheritance1 {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
        c.fly();
        c.landing();
        c.feat();

        PassengerPlane p = new PassengerPlane();
        p.fly();
        p.landing();
        p.feat();
    }
}
