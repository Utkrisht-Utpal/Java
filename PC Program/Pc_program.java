import java.util.Scanner;

public class Pc_program {

    public static class Computer {
        public boolean turn_on(boolean boot, String gpu, int salary){
            if (boot) {
                goShopping(salary);
                playGame(gpu);
                return true;
            }
            else return false;
        }
        void goShopping(int Salary){
            System.out.println((Salary > 1_00_000) ? "You are shopping!" : "You are broke!");
        }
        public void playGame(String GPU){
            int gpuValue = Integer.parseInt(GPU);
            if (gpuValue > 4090) {
                System.out.println("You are playing games.");
            }
            else System.out.println("The game couldn't be running!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to start you PC? ");
        String turnOn = scanner.next();
        boolean boot = Boolean.parseBoolean(turnOn);
        System.out.println(boot);

        Computer comp = new Computer();
        boolean state = comp.turn_on(boot, "500", 80_000);

        System.out.println(state ? "The system is running!" : "The system failed!!");
        scanner.close();
    }
}