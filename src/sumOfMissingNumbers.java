import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class sumOfMissingNumbers {
    public static void main(String[] args) {
        List<Number> data = readInput();
        int result = sumOfMissingNumbers(data);
        System.out.println(result);
    }

    public static int sumOfMissingNumbers(List<Number> data) {
        int sum = 0;
        for(int i =0; i<data.size()-1; i++)
        {
            for(int j = data.get(i).intValue()+1; j<data.get(i+1).intValue(); j++)
            {
                sum+=j;
            }

        }
        return sum;
    }

    public static List<Number> readInput() {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        String input = scanner.nextLine();
        return gson.fromJson(input, new ArrayList<Number>().getClass());
    }
}
