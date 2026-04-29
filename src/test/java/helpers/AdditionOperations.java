package helpers;

public class AdditionOperations {

    public String stringAddition(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 + num2);
    }

    public String stringMultiplication(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 * num2);
    }

    public String stringDivision(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 / num2);
    }

    public String stringModulo(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 % num2);
    }
}