import java.util.*;

class Human {
    private String name;
    private int age;
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class encaps {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Human h1 = new Human("Name", 18);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        h1.setAge(age);

        System.out.println(h1.getAge());
        System.out.println(h1.getName());
    }
}