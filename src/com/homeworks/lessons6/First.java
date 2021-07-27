package com.homeworks.lessons6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {

    public void homeRegexOne(String input) {//1) Любое количество букв, а потом две цифры и наоборот.
        String pattern = "[a-zA-z]*\\d{2}";
        String patternTwo = "\\d{2}[a-zA-z]*";

        Pattern regex = Pattern.compile(pattern);
        Pattern regexTwo = Pattern.compile(patternTwo);

        Matcher matcher = regex.matcher(input);
        Matcher matcher1 = regex.matcher(input);
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }

    public void homeRegexTwo(String input2) { // 2) 2-4 цифры, а потом 2-4 буквы и наоборот.
        String pattern = "\\d{2,4}[a-zA-Z]{2,4}[a-zA-Z]{2,4}\\d{2,4}";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(input2);

        System.out.println(matcher.matches());
    }

    public void homeRegexThree(String input3) {//3) Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах.
        // Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.
        String pattern = "[A-Z][a-z]*\\s[A-Z][a-z]*";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(input3);

        System.out.println(matcher.matches());
    }

    public void homeRegexFour(String input4) {//4) В строке содержутся слова и числа. Необходмо выделить числа и посчитать их сумму.
        Pattern pattern = Pattern.compile("\\d");

        Matcher matcher = pattern.matcher(input4);
        int count = 0, sum = 0;
        while (matcher.find()){
            for (int i = 0; i < matcher.group().length(); i++) {
                if (Character.isDigit(matcher.group().charAt(i))) {
                    count++;
                    sum += Integer.parseInt(String.valueOf(matcher.group().charAt(i)));
                }
            }
        }
        System.out.println("number of digits in a line:" + "\t" + count);
        System.out.println("Sum of numbers:"+ "\t" +sum);



    }

    public void homeRegexFive(String input5) {// 5) Пользователь вводит телефон в формате (ххх)ххх-хх-хх
        // (ххх) должен быть таким: (095), (097), (073), (067), (099), (063). Проверить, чтобы 7-ый номер был в формате
        // "(ххх)ххх-хх-хх".
        Pattern regex = Pattern.compile("\\W(095|097|073|067|099|063)\\W(\\w{3})*\\W*(\\w{2})*\\W*(\\w{2})*");//|-или ()-группируем
//      Pattern regex = Pattern.compile("\\W(095|097|073|067|099|063)\\W;//|-или ()-группируем
        Matcher matcher = regex.matcher(input5);

        if (matcher.find()) {

            switch (matcher.group()) {
                case "(067)xxx-xx-xx":
                case "(097)xxx-xx-xx":
                    System.out.println("Kievstar");
                    break;
                case "(095)xxx-xx-xx":
                case "(099)xxx-xx-xx":
                    System.out.println("MTC");
                    break;
                case "(073)xxx-xx-xx":
                case "(063)xxx-xx-xx":
                    System.out.println("Life");
                    break;
            }
        } else {
            System.out.println("nothing");
        }

       /* if (matcher.lookingAt()) {
             System.out.println( matcher.lookingAt());
            if (matcher.group()=="(067)xxx-xx-xx"  || matcher.group().equals("(097)xxx-xx-xx")) {
                System.out.println("Kievstar");
            } else if (matcher.group().equals("(095)xxx-xx-xx") || matcher.group().equals("(099)xxx-xx-xx")) {
                System.out.println("MTC");
            } else if (matcher.group().equals("(073)xxx-xx-xx") || matcher.group().equals("(063)xxx-xx-xx")) {
                System.out.println("Life");
            }
        } else {
            System.out.println("nothing");
        }*/

    }

}
