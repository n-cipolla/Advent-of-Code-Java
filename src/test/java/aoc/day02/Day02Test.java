package aoc.day02;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {

    @Test
    public void testPart1(){
        // Given
        String input = "test";

        // When
        String result = new Day02().part1(input);

        // Then
        assertEquals(input, result);
    }

    @Test
    public void testPart2(){
        // Given
        String input = "test";

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals(input, result);
    }
}