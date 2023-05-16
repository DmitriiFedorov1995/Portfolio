package model;
import java.math.*;
import java.util.Objects;

public class Calculator {

    public static String execute(String[] params) {
        String operator = params[0];
            if (Objects.equals(params[1], " ")
                    || Objects.equals(params[2], " ")
                    || params[0] == null
                    || params[1] == null
                    || params[2] == null
                    || params[0].equals("")
                    || params[1].equals("")
                    || params[2].equals("")) {
                throw new CalculatorException();
            }


        double value1;
        double value2;
        // todo: доработать код, чтобы все негативные тесты проходили успешно
        try {
            value1 = Double.parseDouble(params[1]);
            if (value1 > Integer.MAX_VALUE || value1 < Integer.MIN_VALUE) {
                throw new CalculatorException("Превышен порог значений");
            }
        } catch (NumberFormatException e){
            throw new CalculatorException("нечисловой параметр");
        }

        try {
            value2 = Double.parseDouble(params[2]);
            if (value2 > Integer.MAX_VALUE || value2 < Integer.MIN_VALUE) {
                throw new CalculatorException("Превышен порог значений");
            }
        }catch (NumberFormatException e){
            throw new CalculatorException("нечисловой параметр");
        }

        double result = calculate(operator, value1, value2);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new CalculatorException("Превышен порог значений");
        }
        return String.valueOf(BigDecimal.valueOf(result));
    }



    private static double calculate(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return add(a, b);
            case "-":
                return subst(a, b);
            case "*":
                return mult(a, b);
            case "/":
                return div(a, b);
        }
        throw new CalculatorException("Неизвестный оператор");
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subst(double a, double b) {
        return a - b;
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new CalculatorException();
        }
        return a / b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }


}
