import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] params = readParams();
        System.out.println(Calculator.execute(params));
        Double x = Integer.MAX_VALUE + 0.0000000000000001;
        System.out.println(x > Integer.MAX_VALUE);

    }

    private static String[] readParams() {
        String [] num = new String[3];
        Scanner scanner = new Scanner(System.in);
        num[0] = scanner.nextLine();
        num[1] = scanner.nextLine();
        num[2] = scanner.nextLine();// todo: считать из консоли данные, затем вернуть их в виде массива строк
        return num;
    }
}
