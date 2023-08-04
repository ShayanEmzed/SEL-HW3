package calculator;

import java.lang.Math;

public class Calculator {

    public int doOperation(int a, int b, char opt) {
        if (opt == '*') {
            return a * b;
        } else if (opt == '/') {
            return a / b;
        } else if (opt == '^') {
            return (int) Math.pow(a, b);
        }
        return 0;
    }
}