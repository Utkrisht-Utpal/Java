public class test {
    class Innertest {
        static  String name = "Utkrisht";
        String brand;
        int price;
        
        void display (){
            System.out.println(name);
            System.out.println(this.brand);
            System.out.println(this.price);
        }
    }
    
    public static void main(String[] args) {
        test obj = new test();

        Innertest obj1 = obj.new Innertest();
        obj1.brand = "Samsung";
        obj1.price = 45_000;
        obj1.display();
        
        Innertest obj2 = obj.new Innertest();
        obj2.brand = "Apple";
        obj2.price = 70_000;
        obj2.display();
    }
}
