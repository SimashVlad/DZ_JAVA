import java.util.Scanner;

public class Calculator {
    static Scanner iScaner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = GetInt();
        int num2 = GetInt();
        char operation = getOperation();
        int res = calc(num1, num2, operation);
        System.out.println("Результат операции: " + res);
        replay(args);
    }

    public static int GetInt() {
        System.out.println("Введите число:");
        int num;
        if (iScaner.hasNextInt()) {
            num = iScaner.nextInt();
        } else {
            System.out.println("Пожалуйста, убедитесь, что Вы ввели число и поробуйте еще раз.");
            iScaner.next();
            num = GetInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (iScaner.hasNext()) {
            operation = iScaner.next().charAt(0);
        } else {
            System.out.println("Пожалуйста, убедитесь, что Вы ввели симвал операции и попробуйте еще раз.");
            iScaner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int res;
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Пожалуйста, убедитесь, что ввели корректные данные и повторите ввод.");
                res = calc(num1, num2, getOperation());
        }
        return res;
    }

    public static void replay(String[] args) {
        System.out.println("Желаете повторить? Введите 'yes' или 'no': ");
        String repl = iScaner.next().toLowerCase();
        if (repl.equals("yes")) {
            main(args);
        } else if (repl.equals("no")) {
            System.out.println("Всего хорошего.");
        } else {
            System.out.println("Пожалуйста введите либо 'Yes', либо 'no'.");
            replay(args);
        }
    }
}