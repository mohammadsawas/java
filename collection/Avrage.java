package Dahmanpset2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Avrage {
    public static void main(String[] args) {
        String  pathfile = "src/Dahmanpset2/text";
        Path path = Paths.get(pathfile);
            try {
                List<String> lines = Files.readAllLines(path);
                System.out.println(path.toAbsolutePath());
                System.out.println("this is every letter once");

                lines.stream()
                        .map(name -> name.split(""))
                        .flatMap(name -> Arrays.stream(name))
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                        .forEach(letter-> System.out.println(letter));
                System.out.println("this is the letter group upper and lower case");

                lines.stream()
                        .map(name -> name.split(""))
                        .flatMap(name -> Arrays.stream(name))
                        .map(letter -> letter.toUpperCase())
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                        .forEach(letter-> System.out.println(letter));

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

}
