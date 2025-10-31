import com.google.gson.Gson;
import java.util.*;
public class set {
    public static void main(String[] args) {
        List<Double> data = readInput();
        String result = countNumbers(data);
        System.out.println(result);
    }

    public static String countNumbers(List<Double> data) {
        String result = "";
        int uniqueCount = 0;
        int duplicateCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        Double tmp ;
        for(int i = 0; i< data.size(); i++)
        {
            /*if(data.get(i) ==0)
                zeroCount++;*/
           /*if(data.get(i)%2 ==0 && data.get(i)!=0)
                evenCount++;*/
            if(data.get(i)%2 !=0 && data.get(i)!=0)
                oddCount++;
            tmp = data.get(i);
            for(int j= i+1 ; j<data.size(); j++)
            {
                if(tmp == data.get(j))
                    uniqueCount++;
                if(tmp !=data.get(j))
                    duplicateCount++;
            }
        }
        result = String.valueOf(zeroCount);
        result += uniqueCount;
        result += duplicateCount;
        result += zeroCount;
        result += evenCount;
        result += oddCount;
        return result;

    }

    public static List<Double> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Gson gson = new Gson();
        List<Double> data = gson.fromJson(input, List.class);
        return data;
    }
}
