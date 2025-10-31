import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
public class SumDiagonalGrid {
    public static void main(String[] args) {
        List<List<Integer>> grid = readInput();
        Integer result=0;
        if(grid.size()==grid.get(0).size())
        {
            int start=0;
            int length=grid.size()-1;
            for( int i=0;i<grid.size();i++)
            {
                List<Integer> row = grid.get(i);
                result+=row.get(start)+row.get(length);
                start+=1;
                length-=1;

            }
        }
        else
            result = -1;

        System.out.println(result);
    }

    public static List<List<Integer>>readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return new Gson().fromJson(input, new TypeToken<List<List<Integer>>>() {}.getType());
    }
}
