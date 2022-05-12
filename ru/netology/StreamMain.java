package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> positive = new ArrayList<>();

        for (int x : intList){
            if (x > 0){
                positive.add(x);
            }
        }

        Collections.sort(positive);

        for (int i : positive){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
