package SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
        //2. взимаме елементите, които ги има в двата сета
        String input = scanner.nextLine();//"4 3".split -> ["4", "3"]
        int countFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int countSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        //1.Пълним си двата сета
        for (int i = 0; i < countFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < countSecondSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        //2. взимаме елементите, които ги има в двата сета
        // 1. нов сет за съхранение на елементите
        LinkedHashSet<Integer> dublicatedElements = new LinkedHashSet<>();
        for (Integer number : firstSet) {
            if (secondSet.contains(number)) {
                dublicatedElements.add(number);
            }
        }
        dublicatedElements.forEach(e -> System.out.print(e + " "));


        //2. сравняване с функцията retainAll
       // firstSet.retainAll(secondSet);
        //в първия сет остават елементите, които ги има във втория
       // firstSet.forEach(e -> System.out.print(e + " "));

    }
}
