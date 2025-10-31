import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TripleGenerator {
    public static void main(String[] args) {
        int height = readInput();
        List<List<Integer>> result = createTriangle(height);
        Gson gson = new Gson();
        String jsonResult = gson.toJson(result);
        System.out.println(jsonResult);
    }

    public static List<List<Integer>> createTriangle(int height) {
List<List<Integer>> lists = new ArrayList<List<Integer>>(3);
for(int i=0; i<height; i++)
{
    ArrayList<Integer> row = new ArrayList<>();

}
return lists;
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
