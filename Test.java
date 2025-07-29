import java.util.Scanner;

public class Test{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hello there! Enter your name: ");
        String name = input.next();
    
        System.out.print("Fine! Tell me your age: ");
        int age = input.nextInt();
        
        System.out.print("Your name is: " + name);
        System.out.print("Your age is: " + age);

        input.close();
    }
}