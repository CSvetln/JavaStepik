import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;

public class Mirror {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = mirrorArray(data);
        System.out.println(convertToString(result));
    }

    public static List<Integer> mirrorArray(List<Integer> data) {
        for (int i = data.size()-2; i>=0; i--){
            data.add(data.get(i));
        }
        return data;
    }

    public static String convertToString(List<Integer> arr) {
            return arr.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));

    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> data = new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
        return data;
    }
}
