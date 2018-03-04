package Dahmanpset1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Spliting {
    public static void main(String[] args) {
        // String names = "Sami ;Ahmad ; 1;'14-02-1981'; [2 ,3 ,4 ];[English ,German ,Seince ];1872\n" +
        //       "Rami ;Frah ;1;'23-04-1977' ;[2 ,3 ,4 ];[Math];3298";
        String path = "src/test.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.stream()
                    .map(name -> name.split(";"))
                   // .flatMap(e -> Arrays.stream(e))
                    .forEach(namee -> Arrays.stream(namee).forEach(name-> System.out.println(name)));
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
