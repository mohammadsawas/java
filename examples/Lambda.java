package examples;

import java.io.PrintStream;
import java.util.Scanner;

public class Lambda {
    public static void main(String[] args) {
        System.out.println("=== RunnableTest ===");
             // Anonymous Runnable
        Runnable r1 = new Runnable(){
            @Override
       public void run(){
                System.out.println("Hello world one!");
            }
     };

             // Lambda Runnable
             Runnable r2 = () -> System.out.println("Hello world two!");
             Runnable r3 = ()-> System.out.println("hello bro");
             // Run em!
             r1.run();
             r2.run();
             r3.run();

           }
 }
