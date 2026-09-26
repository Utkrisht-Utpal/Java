class Human {
    private String name = "Utpal";
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class encaps {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(18);

        System.out.println(h1.getAge());
    }
}

class Test {
    Human h2 = new Human();
    h2.setAge(18);
}