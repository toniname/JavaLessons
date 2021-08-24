package com.homeworks.lessons6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerTwo {
    public void homeRegexTwo(String value) throws IOException {

        FileReader fr = new FileReader("D:/джава/part3.txt");
        try(fr;
        Scanner scanner = new Scanner(fr)) {

            String input = scanner.nextLine();
            System.out.println(input);

            Pattern regex = Pattern.compile(value);
            Matcher matcher = regex.matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            System.out.println("End");

        }
    }
}
