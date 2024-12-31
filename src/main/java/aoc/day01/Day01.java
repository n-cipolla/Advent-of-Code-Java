package aoc.day01;

import aoc.Day;
import aoc.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(String input) {
        String[] parts = input.split("\n");
        ArrayList<String> lines = new ArrayList<String>(Arrays.asList(parts));

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(String line : lines) {
            String[] words = line.split("   ");
            left.add(Integer.valueOf(words[0].trim()));
            right.add(Integer.valueOf(words[1].trim()));
        }

        Collections.sort(left);
        Collections.sort(right);

        int sum = 0;
        for (int left_num : left) {
            int occur = 0;
            if (right.contains(left_num)) {
                // find the number of occurrences
                occur = countOccur(left_num, right);
            }
            sum += left_num * occur;
        }

        return String.valueOf(sum);
    }

    @Override
    public String part2(String input) {
        return "Used part1 code to solve part2.";
    }

    public static int countOccur(int left_num, ArrayList<Integer> right) {
        int count = 0;
        for (int right_num : right) {
            if (left_num == right_num) {
                count++;
            }
        }
        return count;
    }

}
