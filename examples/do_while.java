package examples;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0;
        do{
            System.out.println("bro");
            i ++;
        }while(number> i );
    }
}
