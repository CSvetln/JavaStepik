import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
public class SumStartEnd {
    public static void main(String[] args) {
        Triple<List<Integer>, Integer, Integer> input = readInput();
        List<Integer> data = input.getFirst();
        int start = input.getSecond();
        int end = input.getThird();
        int result = 0;
        int indexStart = data.indexOf(start);
        int indexEnd = data.lastIndexOf(end);
        if(indexStart!=-1 && indexEnd!=-1 && indexEnd> indexStart) {
            for (int i = indexStart; i <= indexEnd; i++) {
                result += data.get(i);
            }
        }



        System.out.println(result);
    }

    public static Triple<List<Integer>, Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" \\| ");

        List<Integer> data = new Gson().fromJson(values[0], new TypeToken<List<Integer>>() {}.getType());
        int start = Integer.parseInt(values[1]);
        int end = Integer.parseInt(values[2]);

        return new Triple<>(data, start, end);
    }
}



