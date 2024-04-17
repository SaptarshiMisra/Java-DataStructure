package array.easy;

import interfaces.GenericPrinter;

import java.util.Arrays;

public class ArrayToStringPrinter implements GenericPrinter<String,int[]> {

    @Override
    public String print(int[] input) {
        StringBuilder outputString = new StringBuilder("");
        Arrays.stream(input).forEach(value -> outputString.append(value+", "));
        return outputString.toString();
    }
}
