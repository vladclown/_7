import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Введите число");
            int value = new Scanner(System.in).nextInt();
            for (int i = 1; i <= value; i = i + 1) {
                int solution = value * i;
                System.out.println(value + " * "  + i + " = " + solution);
            }

        }

    }

}
