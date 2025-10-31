import java.util.Scanner;
public class Subfactorial {
    public static void main(String[] args) {
        int n = readInput();
        double result =0;
        for(int i = 0; i<=n; i++)
        {
            result += Math.pow(-1, i) / factorial(i);
        }
        result *= factorial(n);

        System.out.println(result);
    }

    public static int factorial(int param) {
        int result = 1;
        for(int i =1; i<=param ; i++)
        {
            result *= i;
        }
        return result;
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
