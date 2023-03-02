import java.util.List;

public class human {
    private String name;
    private String surname;
    private int age;
    private String wife;
    private String mother;
    private String father;
    private List<String> children;

    public enum sex {
        male, female;
    }

    public human (String name, String surname, int age, String wife, String mother, String father) {
        this.name  = name;
        this.surname  = surname;
        this.age  = age;
        this.wife  = wife;
        this.mother  = mother;
        this.father  = father;
    }

    

}