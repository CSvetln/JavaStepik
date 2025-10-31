
import com.google.gson.Gson;
        import com.google.gson.reflect.TypeToken;
        import java.util.*;

public class ZeroWirhSum {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = replaceZeroWithSum(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> replaceZeroWithSum(List<Integer> data) {
        for(int i =2;i<data.size();i++)
        {
            if(data.get(i)==0)
            {
                data.set(i, data.get(i-1)+data.get(i-2));
            }
        }
        return data;
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}