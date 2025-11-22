class Learn{
    private int id;
    private String name;
    private String city;

    void setId(int id){
        this.id = id;
    }

    void setName(String name){
        this.name = name;
    }

    void setCity(String city){
        this.city = city;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    String getCity(){
        return city;
    }
}

public class Learning{
    public static void main(String[] args){
        Learn l = new Learn();
        l.setId(123);
        l.setName("Ramchandra");
        l.setCity("Pokhara");
        System.out.println("id = " + l.getId());
        System.out.println("Name = " + l.getName());
        System.out.println("City = " + l.getCity());
    }
}
