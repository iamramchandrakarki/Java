class Dog{
    private int cost;
    private String name;
    private String color;

    Dog(int cost, String name, String color){
        this.cost = cost;
        this.name = name;
        this.color = color;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

public class FirstCons{
    public static void main(String[] args){
        Dog d = new Dog(5000, "Tommy", "Black");
        System.out.println(d.getCost());
        System.out.println(d.getName());
        System.out.println(d.getColor());
    }
}
