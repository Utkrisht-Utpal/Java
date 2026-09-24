public static void main (String [] args) {
    int number = 50;
    
    for (int i = 2; i <= number; i++) {
        System.out.print((i % 2 == 0) ? "\t" + i : "");
    }
}