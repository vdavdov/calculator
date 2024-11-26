package by.vdavdov.calculator;

import java.io.*;

public class CalculatorApp {

    public static void main(String[] args) {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        String operand;

        System.out.println("Введите пример арифметической операции:");
        try {
            String[] example = bis.readLine().split(" ");

            if (example.length != 3) {
                throw new RuntimeException("Your string is wrong");
            }

            if (example[0].length() == 1 && example[1].length() == 1 && example[2].length() == 1) {
                a = Integer.parseInt(example[0]);
                b = Integer.parseInt(example[2]);
                operand = example[1];
            } else {
                throw new RuntimeException("Number can be only 1 numeric length");
            }

            math(a, b, operand);
        } catch (IOException e) {
            throw new RuntimeException("IOException, u write wrong line");
        }
    }

    private static void math(int a, int b, String operand) {
        try {
            int result;
            switch (operand) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    result = 0;
            }
            System.out.printf("Result of your operation is: %d", result);
        } catch (Exception e) {
            throw new RuntimeException("Format of your string is wrong", e);
        }
    }

}
