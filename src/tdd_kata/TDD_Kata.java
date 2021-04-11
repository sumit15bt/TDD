/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd_kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sumit
 */
public class TDD_Kata {

    private static Pattern pattern = Pattern.compile("-?\\d*"); // matches digits
    private static Matcher matcher;

    public static int add(String numbers) throws Exception {
        int sum = 0;
        matcher = pattern.matcher(numbers); // coming string with no
        while (matcher.find()) {
            String match = matcher.group();
            if (!match.isEmpty()) {
                int no = Integer.parseInt(match);
                if (no > 0) {
                    if (no < 1000) {
                        sum += no;
                    }
                } else {
                    throw new Exception("negatives not allowed");
                }
            }
        }
       
        return sum;
    }

    public static void main(String[] args) throws Exception {
        // different testCases;
    }

}
