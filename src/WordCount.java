import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        String message = readInput();
        int result = 0;
        for(int i=0; i<message.length();i++)
        {
            char character = message.charAt(i);
            if(character == ' ' || character == '.')
                result++;
        }
        System.out.println(result);
    }





    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}
