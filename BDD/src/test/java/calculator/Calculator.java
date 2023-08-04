package calculator;

public class Calculator {

    public int doOperation(int a, int b, char opt) {
        if (opt == '*') {
            return a * b;
        } else if (opt == '/') {
            return a / b;
        } else if (opt == '^') {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
        return 0;
    }
}