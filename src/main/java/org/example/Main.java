package org.example;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("John","Alex","Michael","John","Alex");
        List<String> result = names.stream().distinct().toList();

        System.out.println(result);
    }
}