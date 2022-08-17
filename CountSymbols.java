package SetsAndMapsAdvanced.Exercise;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        TreeMap<Character, Integer> symbolsCount = new TreeMap<>();
        // символ и бр. на срещанията

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            //1. символът вече да съм го срещал
            if (symbolsCount.containsKey(currentSymbol)){
                int currentCount = symbolsCount.get(currentSymbol);
                symbolsCount.put(currentSymbol, currentCount +1);
            }
            //символът да не съм го срещал
            else {
                symbolsCount.put(currentSymbol, 1);
            }
        }
        //принтиране с ентрисет
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s"));

       //принтиране с мап.форийч
       // symbolsCount.forEach((key, value) -> System.out.println(key + ": " + value + " time/s"));
    }
}
