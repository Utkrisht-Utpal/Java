public class overloading {

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        overloading obj = new overloading();

        obj.display(10);
        obj.display(20, 30);
        obj.display("Utpal");
    }
}