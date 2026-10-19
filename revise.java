import java.util.Scanner;

public class revise {
    public static void main (String []args) {
    
    Scanner sc = new Scanner(System.in);

    try {
        System.out.print("Enter your name: ");
        Integer name = sc.nextInt();
        
        System.out.println(name);
    }
    catch(Exception e) {
        System.out.println("Internal server error! \nKindly enter an integer" + "\nYour java core error is: " + e);
    }

    sc.close();

    }
}