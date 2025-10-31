import com.google.gson.Gson;
import java.util.*;
public class generateArray {
    public static void main(String[] args) {
        int length = readInput();
        List<Integer> result = generateArray(length);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> generateArray(int length) {
        List<Integer> result = new ArrayList<Integer>(length);
        for(int i =0; i<length; i++)
        {
            if(i%2 == 0)
                result.add(1);
            else
                result.add(i, i%3);

            //result.add(i, (i)%3);
        }
        return result;
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
