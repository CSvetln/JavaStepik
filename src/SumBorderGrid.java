import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
public class SumBorderGrid {
    public static void main(String[] args) {
        List<List<Integer>> grid = readInput();
        int result = 0;
        List<Integer> row = grid.get(0);
        for( int i=0;i<row.size();i++)
        {
            result+= row.get(i);

        }
        row = grid.get(grid.size()-1
        );
        for( int i=0;i<row.size();i++)
        {
            result+= row.get(i);

        }
        for( int i=0;i<grid.size();i++)
        {
            result += grid.get(i).get(0);
            result += grid.get(i).get(row.size()-1);
        }

        System.out.println(result);
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return new Gson().fromJson(input, new TypeToken<List<List<Integer>>>() {}.getType());
    }
}
