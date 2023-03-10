package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,2));

        System.out.println(solution.quicksort(nums));
    }
}

class Solution {
    public ArrayList<Integer> quicksort(ArrayList<Integer> array) {

        ArrayList<Integer> temp = new ArrayList<>();
        Random random = new Random();

        if(array.size() < 2) {
            return array;
        } else {

            int pivot =  array.get(random.nextInt(array.size() - 1));

            ArrayList<Integer> smallerThan = new ArrayList<>();

            ArrayList<Integer> biggerThan = new ArrayList<>();

            for (int item : array) {
                if (item > pivot) {
                    biggerThan.add(item);
                }
                if (item < pivot) {
                    smallerThan.add(item);
                }
            }

            temp.addAll(quicksort(smallerThan));
            temp.add(pivot);
            temp.addAll(quicksort(biggerThan));

            return temp;
        }

    }
}