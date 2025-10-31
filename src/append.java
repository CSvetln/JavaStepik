import java.util.*;
public class append {
    public static void main(String[] args) {
        String message = readInput();
        //StringBuilder result = new StringBuilder();
        List<String> result = new ArrayList<String>();
        for(int i = 0; i< message.length()-1; i+=2)
        {
            for(int j =0; j< Character.getNumericValue(message.charAt(i+1)); j++)
                result.add(Character.toString(message.charAt(i)));
        }
        System.out.println(String.join(", ", result));
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
