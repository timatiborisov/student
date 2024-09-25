package org.example.regex;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        System.out.print("Text kiriting: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Pattern patter = Pattern.compile("[0-9]{2}");

        Matcher matcher = patter.matcher(text);
        int coun = 0;

        for (int i = 0; i < text.length(); i++) {
            if (matcher.find()){
                System.out.println(i+1+ " group() = " + matcher.group());
                coun++;
            }
        }
        System.out.println("coun = " + coun);


    }

}
