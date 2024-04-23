package util;

import util.interfaces.GenericPrinter;

import java.util.Arrays;

public class TwoDArrayToStringPrinter implements GenericPrinter<String,int[][]> {
    @Override
    public String print(int[][] input) {
        StringBuilder outputString = new StringBuilder("");
        Arrays.stream(input).forEach(value -> outputString.append(new ArrayToStringPrinter().print(value)+"\n"));
        return outputString.toString();
    }
}
